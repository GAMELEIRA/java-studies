# Student Management

Este repositório contém a implementação de um sistema de gerenciamento de estudantes, aplicando os conceitos de Encapsulamento em Java.

## Sumário
- [Descrição](#descrição)
- [Estrutura dos Dados](#estrutura-dos-dados)
- [Visuais](#visuais)
- [Ferramentas de Desenvolvimento](#ferramentas-de-desenvolvimento)
- [Requisitos para Instalação](#requisitos-para-instalação)
- [Instalação](#instalação)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Uso](#uso)
- [Apoiar](#apoiar)
- [Autores e Agradecimentos](#autores-e-agradecimentos)
- [Licença](#licença)
- [Status do Projeto](#status-do-projeto)

## Descrição
O projeto **Student Management** implementa um sistema simples para gestão de estudantes, permitindo:

- Cadastro de estudantes
- Listagem de estudantes cadastrados
- Busca de estudante por matrícula
- Remoção de estudantes

O objetivo principal é demonstrar o conceito de **Encapsulamento**, garantindo que os atributos das classes estejam protegidos e acessíveis apenas por meio de métodos específicos.

## Estrutura dos Dados
A classe `Student` possui os seguintes atributos encapsulados:

- `name`: Nome do estudante
- `registration`: Matrícula do estudante
- `scoreFinal`: Nota final do estudante

Os métodos *getters* e *setters* são utilizados para acessar e modificar esses atributos de forma controlada.

## Visuais
Atualmente, o projeto não possui interfaces gráficas ou representações visuais. Todas as interações são feitas via console.

## Ferramentas de Desenvolvimento
Para o desenvolvimento e execução deste projeto, foram utilizadas as seguintes ferramentas:

- **Java SE Development Kit (JDK)**: Ambiente de desenvolvimento Java.
- **IntelliJ IDEA** ou **Eclipse IDE**: IDE recomendada para desenvolvimento em Java.

## Requisitos para Instalação
Antes de executar o projeto, certifique-se de ter instalado:

- **Java SE Development Kit (JDK) 8 ou superior**: [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- **IntelliJ IDEA ou Eclipse**: [Download IntelliJ](https://www.jetbrains.com/idea/download/) ou [Download Eclipse](https://www.eclipse.org/downloads/)

## Instalação

1. **Clonar o Repositório**:
   ```sh
   git clone https://github.com/GAMELEIRA/studies-backend.git
   ```

2. **Importar o Projeto na IDE**:
   - Abra o IntelliJ IDEA ou Eclipse.
   - Selecione `File > Open` e navegue até o caminho:
     ```
     studies-backend/01-fundamentals/02-concepts/01-oop/03-encapsulation/01-examples/01-student-management
     ```
   - Aguarde a importação do projeto.

## Estrutura do Projeto
O projeto está estruturado da seguinte forma:

```
student-management/
│── src/
│   ├── org/gameleira/models/
│   │   ├── Student.java  # Classe que representa um estudante com atributos encapsulados.
│   │   ├── School.java   # Classe que gerencia a lista de estudantes.
│   ├── org/gameleira/app/
│   │   ├── App.java      # Classe que inicia a aplicação e realiza testes com os objetos criados.
└── README.md
```

## Uso

Para executar o sistema:

1. **Compilar o Projeto**:
   - No IntelliJ IDEA ou Eclipse, clique com o botão direito no projeto e selecione **Run** na classe `App.java`.

2. **Interagir com o Sistema**:
   - O console exibirá as ações realizadas, como adição, busca e remoção de estudantes.

## Apoiar
Feedbacks e sugestões são bem-vindos! Para contribuir ou relatar problemas, por favor, abra uma issue no repositório.

## Autores e Agradecimentos

Desenvolvido por [Gabriel Gameleira dos Santos](https://www.linkedin.com/in/gabriel-gameleira-dos-santos-634b23161/). Agradecimentos especiais a todos que contribuíram para o desenvolvimento deste projeto.

## Licença

Este projeto é licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

## Status do Projeto

O projeto está finalizado.