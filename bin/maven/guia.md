# Criando um Projeto Maven via Linha de Comando

```sh
mvn archetype:generate -DgroupId=com.exemplo -DartifactId=meu-projeto -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Comandos para o Dia a Dia

- **Compilar o projeto:**
  ```sh
  mvn compile
  ```
- **Executar testes:**
  ```sh
  mvn test
  ```
- **Empacotar o projeto (.jar ou .tar):**
  ```sh
  mvn package
  ```
- **Limpar diretório de trabalho:**
  ```sh
  mvn clean
  ```

## Criando Diferentes Tipos de Projeto

- O **Maven Archetype** é um template que define a estrutura base do projeto.
- Para listar os templates disponíveis, use:
  ```sh
  mvn archetype:list
  ```

## Entendendo o POM

- Project Object Model é a unidade fundamental de trabalho do Maven.
- Tem o formato XML.
- Detalha o projeto e como construi-lo.
- Declara o nome do projeto, dependências, módulos, configurações de build, etc.