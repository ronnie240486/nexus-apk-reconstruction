# Plano de reconstrução completa

## Diagnóstico

O APK original possui muitos componentes Android e uma grande quantidade de layouts e recursos, mas o bytecode recuperado não é uma base de build confiável. O crash observado no aparelho ocorre durante a verificação de uma classe em `classes2.dex`, antes do fluxo de usuário, com `java.lang.VerifyError` e constructor inválido. A nova versão não deve reutilizar esse DEX.

## Escopo visual recuperável

| Área | Evidência recuperada | Estratégia |
|---|---|---|
| Identidade | `login_bg.png`, `top_login_logo.png`, ícone `ic_launcher_warez.png` | Reutilizar diretamente na nova base |
| Navegação | Ícones `menu_tvlist`, `menu_sour`, `menu_subtitl`, `menu_fav`, `ic_home_search`, `ic_settings` e dezenas de assets relacionados | Copiar para recursos compiláveis e organizar por módulo |
| Home | `home_layout.xml`, `fragment_home_top_view_nexus_style.xml`, layouts de banner, categoria e item | Reimplementar em Activities/Fragments limpas |
| Catálogo | Layouts de álbum, lista, detalhes, episódios, recomendações e busca | Reimplementar com modelos de dados próprios |
| Live/TV | Layouts de canais, EPG, controles e players | Reimplementar com player moderno e contrato de API definido |
| Configurações | Layouts de servidor, idioma, legenda, qualidade, favoritos e arquivos | Reimplementar progressivamente |
| Conteúdo especial | EPG, partidas, compras, anúncios, WebView, ebooks e apps recomendados | Manter como módulos opcionais após o núcleo |

## Módulos prioritários

1. **Identidade e acesso:** gerar o identificador derivado do Android, exibir/copiá-lo e validar a autorização no painel sem usuário e senha.
2. **Home:** montar a tela inicial com logo, banner, menu de categorias e foco para controle remoto.
3. **Catálogo:** criar modelos para filmes, séries, temporadas, episódios, imagens e favoritos.
4. **Live:** criar lista de canais, categorias, EPG e abertura do player.
5. **Player:** integrar um player Android moderno somente depois de definir URLs, headers, DRM e formatos autorizados.
6. **Configurações:** DNS/servidor, idioma, legendas, qualidade, histórico, atualização e informações do aparelho.
7. **Personalização:** nome, logo, fundo, ícones e até cinco DNS configuráveis pelo painel.

## Limitações que precisam ser tratadas honestamente

A extração recupera nomes de telas, layouts, imagens e partes do contrato de rede, mas não garante o código-fonte original nem o funcionamento do backend. A réplica completa precisa de contratos autorizados do painel para catálogo, canais, autenticação por MAC, anúncios, compras e reprodução. O primeiro APK limpo de 302 KB é somente uma prova de arquitetura e não deve ser confundido com a reconstrução completa.
