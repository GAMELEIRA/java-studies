# Gerenciamento de Biblioteca

Este repositório contém a implementação de um sistema de gerenciamento de biblioteca, desenvolvido para exemplificar os conceitos de Programação Orientada a Objetos (POO) em Java.

## Sumário

1. [Descrição](#descrição)
2. [Estrutura dos Dados](#estrutura-dos-dados)
3. [Visuais](#visuais)
4. [Ferramentas de Desenvolvimento](#ferramentas-de-desenvolvimento)
5. [Requisitos para Instalação](#requisitos-para-instalação)
6. [Instalação](#instalação)
7. [Estrutura do Projeto](#estrutura-do-projeto)
8. [Uso](#uso)
9. [Apoiar](#apoiar)
10. [Autores e Agradecimentos](#autores-e-agradecimentos)
11. [Licença](#licença)
12. [Status do Projeto](#status-do-projeto)

## Descrição

O sistema de gerenciamento de biblioteca oferece as seguintes funcionalidades:

- **Cadastro de Livros**: Permite adicionar novos livros ao acervo da biblioteca.
- **Registro de Usuários**: Possibilita o cadastro de usuários que podem realizar empréstimos de livros.
- **Empréstimo de Livros**: Gerencia o processo de empréstimo e devolução de livros pelos usuários.

## Estrutura dos Dados

A estrutura de dados do sistema é composta por:

1. **Livro (`Book`)**:
   - `title`: Título do livro (String)
   - `author`: Autor do livro (String)
   - `isbn`: Código ISBN do livro (String)
   - `available`: Disponibilidade do livro (boolean)

2. **Usuário (`User`)**:
   - `name`: Nome do usuário (String)
   - `userId`: Identificador único do usuário (String)
   - `borrowedBooks`: Lista de livros emprestados pelo usuário (List<Book>)

3. **Biblioteca (`Library`)**:
   - `books`: Lista de livros disponíveis na biblioteca (List<Book>)
   - `users`: Lista de usuários registrados na biblioteca (List<User>)

## Visuais

Atualmente, o projeto não possui interfaces gráficas ou representações visuais. Todas as interações são realizadas via console.

## Ferramentas de Desenvolvimento

Para o desenvolvimento e execução deste projeto, foram utilizadas as seguintes ferramentas:

- **Java SE Development Kit (JDK)**: Ambiente de desenvolvimento Java.
- **Eclipse IDE**: Ambiente de desenvolvimento integrado recomendado para Java.

## Requisitos para Instalação

Antes de executar o projeto, certifique-se de ter instalado:

- **Java SE Development Kit (JDK) 8 ou superior**: [Download JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- **Eclipse IDE for Java Developers**: [Download Eclipse](https://www.eclipse.org/downloads/packages/release/2025-03/r/eclipse-ide-java-developers)

## Instalação

1. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/GAMELEIRA/studies-backend.git
   ```

2. **Importar o Projeto no Eclipse**:
   - Abra o Eclipse IDE.
   - Selecione `File` > `Import` > `Existing Projects into Workspace`.
   - Navegue até o diretório `studies-backend/01-fundamentals/02-concepts/01-oop/01-class/01-examples/01-library-management` e importe o projeto.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **`src/com/gameleira/model`**: Contém as classes principais do sistema:
  - `Book.java`: Classe que representa um livro.
  - `User.java`: Classe que representa um usuário.
  - `Library.java`: Classe que gerencia o acervo de livros e os usuários.
  - `LibraryManagementSystem.java`: Classe principal que contém o método `main` para execução do programa.

## Uso

Para executar o sistema de gerenciamento de biblioteca:

1. **Compilar o Projeto**:
   - No Eclipse, clique com o botão direito no projeto e selecione `Run As` > `Java Application`.

2. **Interagir com o Sistema**:
   - Siga as instruções exibidas no console para cadastrar livros, registrar usuários e gerenciar empréstimos.

## Apoiar

Feedbacks e sugestões são bem-vindos! Para contribuir ou relatar problemas, por favor, abra uma issue no repositório.

## Autores e Agradecimentos

Desenvolvido por [Gabriel Gameleira dos Santos](https://www.linkedin.com/in/gabriel-gameleira-dos-santos-634b23161/). Agradecimentos especiais a todos que contribuíram para o desenvolvimento deste projeto.

## Licença

Este projeto é licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

## Status do Projeto

O projeto está finalizado por hora.