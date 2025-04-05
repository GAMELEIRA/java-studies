# Zoo Management

Este repositório contém a implementação de um sistema de gerenciamento de zoológico, aplicando os conceitos de **Abstração** em Java.

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

---

## Descrição

O projeto **Zoo Management** tem como objetivo demonstrar o uso do conceito de **Abstração** em programação orientada a objetos. O sistema simula um zoológico com diferentes tipos de animais, permitindo:

- Cadastro de animais com características específicas.
- Organização por espécies e características únicas.
- Exibição das informações de cada animal.

A classe `Animal` é uma classe abstrata que serve como base para outras classes mais específicas como `Lion` e `Dog`.

---

## Estrutura dos Dados

### Classe Abstrata: `Animal`
A classe `Animal` define os atributos e comportamentos comuns a todos os animais:

- `name`: Nome do animal.
- `age`: Idade.

Métodos abstratos são definidos para que cada subclasse forneça sua própria implementação, como por exemplo o som característico do animal (`makeSound`).

### Subclasses:
- `Lion`: Representa um leão.
- `Dog`: Representa um cachorro.

Cada subclasse implementa os métodos abstratos de acordo com seu comportamento.

---

## Visuais

O projeto não possui interface gráfica. Todas as interações são feitas via **console**.

---

## Ferramentas de Desenvolvimento

- **Java SE Development Kit (JDK)**: Ambiente de desenvolvimento Java.
- **IntelliJ IDEA** ou **Eclipse IDE**: IDE recomendada para desenvolvimento em Java.

---

## Requisitos para Instalação

- **Java SE Development Kit (JDK) 8 ou superior**: [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- **IntelliJ IDEA ou Eclipse**: [Download IntelliJ](https://www.jetbrains.com/idea/download/) ou [Download Eclipse](https://www.eclipse.org/downloads/)

---

## Instalação

1. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/GAMELEIRA/studies-backend.git
   ```

2. **Importar o Projeto na IDE**:

   - Abra o **IntelliJ IDEA** ou **Eclipse**.
   - Selecione `File > Open` e navegue até o caminho:

     ```
     studies-backend/01-fundamentals/02-concepts/01-oop/05-abstraction/01-examples/01-zoo-management
     ```

   - Aguarde a importação do projeto.

---

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
zoo-management/
│── src/
│   ├── org/gameleira/models/
│   │   ├── Animal.java     # Classe abstrata base
│   │   ├── Lion.java       # Classe que representa um leão
│   │   ├── Dog.java        # Classe que representa um cachorro
│   ├── org/gameleira/app/
│   │   ├── App.java        # Classe principal que executa a aplicação
└── README.md
```

---

## Uso

### Compilar o Projeto:
- No **IntelliJ IDEA** ou **Eclipse**, clique com o botão direito na classe `App.java` e selecione **Run**.

### Interagir com o Sistema:
- O console exibirá os comportamentos dos animais, como sons e ações específicas.

---

## Apoiar

Feedbacks e sugestões são bem-vindos! Para contribuir ou relatar problemas, **abra uma issue** no repositório.

---

## Autores e Agradecimentos

Desenvolvido por **Gabriel Gameleira dos Santos**.  
Agradecimentos especiais a todos que contribuíram para o desenvolvimento deste projeto.

---

## Licença

Este projeto é licenciado sob a **licença MIT**. Consulte o arquivo `LICENSE` para mais detalhes.

---

## Status do Projeto

O projeto está **finalizado**, podendo ser expandido no futuro para incluir novos tipos de animais e interações.