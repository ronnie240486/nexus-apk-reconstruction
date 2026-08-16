# Relatório técnico inicial — NEXUS 0.2.12

## Escopo

Este documento registra a análise estática do arquivo `nexus-original-0.2.12.apk` fornecido nesta tarefa. O trabalho foi limitado à leitura do contêiner APK, decodificação de manifesto e recursos, descompilação aproximada dos DEX e organização de uma base versionável. O aplicativo não foi executado nem submetido a serviços externos durante esta etapa.

## Identidade e formato

O APK possui o pacote `cn.dolit.nexus`, nome exibido `NEXUS`, `versionCode` `212` e `versionName` `0.2.12`. Ele declara `minSdkVersion` 19, `targetSdkVersion` 34 e é distribuído para `arm64-v8a` e `armeabi-v7a`. O ponto de entrada identificado é `android.media.ViviTV.Pre_launcher`, com suporte a launcher convencional e Android TV.

| Indicador | Resultado |
|---|---|
| Tipo | APK Android instalável |
| Package | `cn.dolit.nexus` |
| Versão | `0.2.12` |
| SDK mínimo | 19 |
| SDK alvo | 34 |
| Arquiteturas | `arm64-v8a`, `armeabi-v7a` |
| Classes DEX | 4 arquivos: `classes.dex` a `classes4.dex` |
| Smali recuperado | 17.472 arquivos |
| Java aproximado | 10.328 arquivos |
| Recursos Android | 2.718 arquivos |
| Bibliotecas nativas | 23 arquivos |

## Tecnologia e arquitetura observada

Os nomes de componentes e os recursos indicam uma aplicação Android nativa, com telas Java e bibliotecas multimídia. O namespace funcional inclui `android.media.ViviTV`, com atividades de inicialização, login, home, pesquisa, reprodução de vídeo sob demanda, reprodução ao vivo, favoritos, configurações, anúncios e componentes relacionados a conteúdo.

Foram encontrados indicadores de AndroidX, Firebase, MQTT via Eclipse Paho, WebView X5, IJK Player/FFmpeg, WebRTC/data channel e bibliotecas nativas específicas. O conjunto de assets também inclui módulos Lua relacionados a leitura de playlists e fontes de metadados, além de uma base SQLite de clima e um arquivo HRTF.

## Empacotamento e ofuscação

O manifesto referencia `s.h.e.l.l.S` como classe de aplicação e `s.h.e.l.l.A` como `appComponentFactory`. Também há `assets/ijiami.ajm` e executáveis `assets/ijm_lib/*/libexec.so`. Esse padrão é compatível com uma camada de proteção ou carregamento em tempo de execução. Como consequência, a saída do JADX apresenta vários nomes artificiais, como classes em `p000`, e alguns métodos podem conter código incompleto ou sem semântica original.

O Apktool registrou avisos de offsets de debug inválidos em diversas classes. Esses avisos afetam informações de depuração e reforçam que a descompilação deve ser validada por comportamento observado, não apenas por compilação textual.

## Permissões e superfície de componentes

O aplicativo declara acesso à internet, rede e Wi-Fi, câmera, estado do telefone, armazenamento legado e mídia, recebimento de boot, instalação de pacotes, janela sobreposta, consulta de pacotes e diversas permissões de sistema ou legadas. Também existem receivers para eventos de pacote e boot, serviços de atualização, tarefas, anúncios, MQTT e processos auxiliares.

A tabela abaixo é uma priorização de revisão, não uma conclusão de vulnerabilidade.

| Área | Observação | Prioridade para melhoria |
|---|---|---|
| Permissões | Há permissões amplas e legadas, incluindo instalação de pacotes, janela sobreposta e consulta de pacotes | Alta |
| Transporte | O manifesto permite tráfego cleartext | Alta |
| Backup | `allowBackup` está habilitado | Média |
| Componentes | Há receivers e componentes exportados que precisam de revisão de intents | Alta |
| Armazenamento | O pacote mistura permissões legadas e permissões de mídia modernas | Média |
| Native code | Existem várias bibliotecas multimídia e de proteção | Alta |

## Indicadores de rede

Foram encontradas strings de rede que incluem serviços de conteúdo, atualização, metadados e fontes de playlist. Entre os domínios ou caminhos identificados estão `api.52itv.cn`, `api.cnnho-vu.cn`, `hub.cnnho-vu.cn`, `control.cnnho-vu.cn`, `update.flvurl.cn` e endpoints de Firebase, além de URLs pertencentes a bibliotecas ou exemplos de players.

Esses valores são evidências estáticas. Eles podem representar configuração antiga, código de biblioteca, exemplos de teste ou fluxos que só são ativados sob determinadas condições. Antes de alterar qualquer endpoint, será necessário confirmar o uso por chamadas observáveis em ambiente autorizado e documentar o formato das respostas.

## Higienização do material versionável

Uma chave Google estava presente nos recursos originais do APK. No projeto exportado foi substituída por `REPLACE_WITH_GOOGLE_API_KEY`, e uma varredura no material staged não encontrou padrões conhecidos de chaves Google, AWS, chaves privadas ou tokens Bearer. O `google_app_id` e o bucket Firebase foram mantidos apenas como identificadores de configuração; ainda assim, devem ser revisados antes de uma distribuição pública.

O hash SHA-256 do APK original está em `analysis/metadata/original-apk.sha256`. Ele permite relacionar esta reconstrução ao artefato analisado sem publicar o binário original no repositório.

## Estado da reconstrução

O código Java aproximado foi exportado para `recovered/jadx/app/src/main/java`, juntamente com `res`, `assets`, `lib` e o manifesto exportado. O Smali original decodificado permanece disponível no diretório de análise local, mas não foi duplicado no repositório inicial para evitar duplicação desnecessária; caso uma etapa futura dependa dele, ele deverá ser adicionado em um commit separado e justificado.

A configuração Gradle exportada ainda contém `dependencies { // TODO: dependencies }`. Portanto, o próximo passo técnico é inventariar imports externos, recuperar as versões das bibliotecas a partir dos metadados do APK e montar dependências mínimas. Só depois disso será possível validar um build reproduzível.

## Plano recomendado de melhorias

O primeiro ciclo deve priorizar a obtenção de uma compilação limpa e de uma instalação assinada de desenvolvimento. Em seguida, recomenda-se reconstruir o fluxo de entrada e configuração, isolar o player e a camada de rede, substituir permissões não utilizadas, bloquear cleartext quando o backend permitir, revisar componentes exportados e criar uma camada de configuração que não dependa de valores hardcoded.

Depois da estabilização técnica, as melhorias de produto podem ser implementadas incrementalmente. Cada mudança deve registrar a tela afetada, a API ou contrato de dados envolvido, o comportamento anterior, o comportamento esperado e um teste manual ou automatizado de regressão.

## Implementação da identificação por aparelho

A primeira alteração de produto substitui as rotas de usuário e senha por `DeviceMacActivity`. Essa Activity calcula um identificador de 48 bits a partir do `Settings.Secure.ANDROID_ID`, usando SHA-256 e formatando os primeiros 12 caracteres hexadecimais como `XX:XX:XX:XX:XX:XX`. O botão de cópia coloca o valor no clipboard para cadastro manual no painel.

O campo de integração correspondente preserva o nome histórico `mac_di`, e o painel deve comparar o valor de forma normalizada, removendo `:` e `-` e usando letras maiúsculas. A tela não tenta ler o MAC físico do Wi-Fi, pois essa informação é restrita ou randomizada em vários cenários do Android moderno. A estratégia é adequada para reinstalação no mesmo perfil e aparelho, mas não promete estabilidade após reset de fábrica, mudança de usuário/perfil, alteração de assinatura ou políticas específicas do fabricante.
