# NEXUS — base de reconstrução do APK

Este repositório contém uma base de trabalho recuperada a partir do APK `nexus-original-0.2.12.apk`, fornecido para análise. O objetivo é transformar o artefato distribuído em uma base versionável que possa ser estudada, corrigida e evoluída de forma controlada.

> **Estado atual:** reconstrução inicial. O código foi recuperado por engenharia reversa e não representa necessariamente o código-fonte original, nem está garantido que compile sem ajustes adicionais.

## Conteúdo

A pasta `recovered/jadx` contém o projeto Gradle exportado pelo JADX, incluindo o Java aproximado, os recursos Android, os assets, o manifesto e as bibliotecas nativas presentes no pacote. A pasta `analysis` contém o manifesto decodificado pelo Apktool, os metadados de versão e o hash SHA-256 do APK de origem.

O APK original não é versionado neste repositório por padrão. O arquivo pode conter material proprietário, bibliotecas de terceiros e identificadores de serviços; além disso, o `.gitignore` bloqueia novos arquivos com extensão `.apk` para evitar inclusão acidental.

## Identificação observada

| Campo | Valor |
|---|---|
| Nome exibido | NEXUS |
| Application ID | `cn.dolit.nexus` |
| Versão | `0.2.12` |
| Version code | `212` |
| Min SDK | 19 |
| Target SDK | 34 |
| Arquitetura nativa | `arm64-v8a`, `armeabi-v7a` |
| Ponto de entrada | `android.media.ViviTV.Pre_launcher` |
| Tecnologia | Aplicação Android nativa, com Java/Smali recuperado |

## Limitações conhecidas

O pacote apresenta ofuscação de classes e um carregador/protetor em `s.h.e.l.l.*`, além de arquivos associados a `ijiami` e `libexec.so`. Esse empacotamento pode fazer com que parte da lógica original seja carregada em tempo de execução ou não seja recuperada de forma fiel pelo descompilador. Por essa razão, o código gerado pelo JADX deve ser tratado como uma aproximação para manutenção, e não como uma reconstrução perfeita.

O projeto exportado pelo JADX possui configuração Gradle, porém as dependências não foram resolvidas automaticamente. A primeira etapa de engenharia será separar o núcleo funcional do aplicativo das bibliotecas incluídas, recuperar os contratos de rede e reconstituir um processo de build reproduzível.

## Segurança e privacidade

Durante a preparação do repositório foi encontrada uma chave Google embutida nos recursos originais do APK. Ela foi removida do material versionável e substituída por `REPLACE_WITH_GOOGLE_API_KEY`. A chave original não deve ser reutilizada; se ainda estiver ativa, recomenda-se rotacioná-la e restringi-la no provedor correspondente.

Os valores de endpoint encontrados no APK foram preservados apenas como evidência técnica no relatório privado. A presença de uma string de URL não prova que o endpoint continue ativo ou que seja usado em todos os fluxos do aplicativo.

## Próximo ciclo de trabalho

A sequência recomendada é validar a execução em um dispositivo ou emulador autorizado, mapear as telas principais, recuperar o fluxo de configuração e conteúdo, remover dependências obsoletas, modernizar permissões e estabelecer testes para os fluxos que serão modificados. As melhorias de produto devem ser feitas em commits pequenos, com uma versão funcional mantida em cada etapa.

## Aviso de direitos

Este repositório não declara licença sobre o aplicativo, seus assets ou bibliotecas de terceiros. Ele deve ser usado somente quando houver autorização para analisar, modificar e redistribuir o software e os materiais envolvidos. Cada dependência ou recurso mantido no projeto deve ser revisado quanto à licença antes de qualquer distribuição pública.

## Alteração em andamento: identificação por aparelho

A tela de usuário e senha foi substituída por uma tela que exibe o identificador do aparelho no formato `XX:XX:XX:XX:XX:XX`. O usuário pode copiar esse valor e cadastrá-lo manualmente no painel. As rotas antigas `LoginActivity` e `LoginLandActivity` agora apontam para a mesma tela de identificação, e o launcher principal também foi redirecionado para ela.

O valor é derivado do `ANDROID_ID` do próprio Android por SHA-256, usando os primeiros 12 caracteres hexadecimais. Assim, o aplicativo não depende do MAC físico do Wi-Fi, que pode ser ocultado ou randomizado pelo sistema. O identificador deve ser cadastrado no painel normalizado, preferencialmente sem separadores (`001122334455`), mesmo que a tela o apresente com dois-pontos para facilitar a leitura.

> A persistência após desinstalação e reinstalação é esperada no mesmo perfil do mesmo aparelho enquanto o `ANDROID_ID` permanecer igual. Ela não pode ser garantida depois de reset de fábrica, troca de perfil/usuário, alteração de assinatura ou políticas específicas do fabricante. O MAC físico real não é uma solução confiável para esse requisito em Android moderno.

## APK de teste

Foi gerada uma variante de teste `nexus-mac-test.apk` a partir do APK original, com o launcher apontando para a tela de identificação e o botão Continuar abrindo diretamente `HomeActivity`. O artefato é assinado com uma chave de desenvolvimento criada para testes e não deve ser usado para atualização sobre uma instalação assinada com outra chave. A assinatura de produção deverá ser feita com o keystore oficial do aplicativo.

A reconstrução do restante do aplicativo foi mantida a partir dos DEX e recursos originais; por isso, esta variante deve ser validada em um dispositivo Android autorizado antes de qualquer distribuição. O APK final de teste é entregue como artefato da tarefa e não é versionado no Git devido à regra que bloqueia binários de distribuição.
