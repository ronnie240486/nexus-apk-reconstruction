# NEXUS Clean App

Esta pasta contém uma base Android nova e limpa, criada para substituir o bytecode reverso que apresentou `java.lang.VerifyError` durante a inicialização. Ela não carrega `classes.dex`, `classes2.dex` ou o `Application` protegido do APK original.

A base atual preserva a identidade visual recuperável: fundo azul-marinho/roxo, logo `NEXUS.TV`, ícone principal e ícones de canais, filmes, séries, favoritos, pesquisa e configurações. A primeira tela mostra o identificador MAC do aparelho, permite copiar o valor para o painel e abre uma Home própria com os módulos visuais.

Os módulos de conteúdo estão representados por uma navegação limpa e segura. A reprodução de canais, filmes e séries ainda precisa de uma API autorizada e de contratos de dados definidos; não foi copiado o código ofuscado quebrado para fingir que esses módulos estão funcionais.

## Identidade do aparelho

O MAC exibido é uma representação de 12 caracteres derivada do `ANDROID_ID` por SHA-256. Ele é formatado como `XX:XX:XX:XX:XX:XX` e deve ser cadastrado no painel sem separadores. O MAC físico do Wi-Fi não é usado, pois pode ser ocultado ou randomizado pelo Android.

## Build

O APK de teste foi compilado com `aapt2`, `javac`, D8/R8, `zipalign` e `apksigner`. A assinatura atual é de desenvolvimento; para distribuição, é necessário usar o keystore oficial do aplicativo. O código-fonte está em `src/main/java`, o manifesto em `AndroidManifest.xml` e os assets compiláveis em `res/drawable`.
