# Kotlin Selenium Cucumber - Automação de Testes[ Web ]

Este projeto tem como objetivo automatizar os testes **Web** utilizando Kotlin + Selenium (webdrivermanager) + Cucumber

## Tecnologias utilizadas

* [Maven](https://maven.apache.org/) - Dependency Management
* [Selenium Webdriver](https://www.seleniumhq.org/projects/webdriver/) - Web Automation Framework
* [Webdriver Manager](https://github.com/bonigarcia/webdrivermanager) - Dependência de gestão de drivers (executores) de browsers
* [Cucumber](https://cucumber.io/) - Framework de interpretação de linguagem natural
* [JUnit](https://junit.org/junit5) - Framework Test
* [Gradle](https://gradle.org/install/) - Gestor de dependências e tarefas
## Versionamento

Nós utilizamos [GIT](https://git-scm.com/) para versionamento.

## IDE

Projeto feito com base no [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/) porém pode ser utilizado qualquer IDE com suporte ao Java e Kotlin.

## Configurando o ambiente

* Faça o download do JDK/JRE 11 [clicando aqui](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)
* Configure a variável de ambiente  [JAVA_HOME](https://www.devmedia.com.br/preparacao-do-ambiente-para-desenvolvimento-em-java/25188)
* Configure a variável de ambiente  [GRADLE_HOME](https://gradle.org/install/) conforme o *Installing manually* de sua plataforma

## Entendendo a arquitetura do framework

**Onde executo os testes ?! :**

* Na classe Runner.kt.

Path da classe:
> ../src/test/kotlin/Runner

**Como executo os testes ?! :**

Editar no `Runner` a tag com a "@" do CT ou da suíte desejada antes de executá-lo, ex :


|            **@all**             | **@< Texto do CT >** |
|                          ---| ---|
|   Todos os testes   | Testes automatizados do CT específico | 

Também é possível executar os testes via linha de comando conforme abaixo:

|                         Exemplo:                          |
|:---------------------------------------------------------:|
| ./gradlew test -D cucumber.options="--tags @tag_desejada" |

Package com as `.feature` para consulta das tags:
> src/main/resources/features*

Package com os `Steps` :
> src/main/kotlin/stepDefinition/*

Package com as `Pages` :
> src/main/kotlin/pageObject/*

## REPORT

O framework possui um `report` gerado em HTML exibindo todo status da execução.

Package com o `src/main/report` :
> src/main/report/index.html

## Autor

* **Nicolai Peixoto** - *Email :* - [Nicolai Peixoto](nicolai_nascimento@hotmail.com)

:)
