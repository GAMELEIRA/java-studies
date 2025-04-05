# Payment System

Este repositório contém a implementação de um sistema de processamento de pagamentos, aplicando os conceitos de **Polimorfismo** em Java.

# Sumário
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

# Descrição

O projeto **Payment System** tem como objetivo demonstrar o uso do conceito de **Polimorfismo** na programação orientada a objetos com Java. O sistema simula diferentes formas de pagamento, cada uma com seu comportamento específico, permitindo:

- Criação de diferentes métodos de pagamento.
- Processamento de pagamentos com base no tipo.
- Demonstração prática do polimorfismo de métodos.

A classe `Payment` é uma classe abstrata base para outras classes concretas como `CreditCard`, `Pix` e `Boleto`.

---

# Estrutura dos Dados

## Classe Abstrata: `Payment`
A classe `Payment` define a estrutura comum a todos os métodos de pagamento:

- Método abstrato: `process(double value)`

## Subclasses:
- `CreditCard`: Representa pagamento via cartão de crédito.
- `Pix`: Representa pagamento via transferência Pix.
- `Boleto`: Representa pagamento por boleto bancário.

Cada subclasse implementa o método `process(double value)` com uma mensagem apropriada.

---

# Visuais

Este projeto não possui interface gráfica. As interações são feitas exclusivamente via **console**.

---

# Ferramentas de Desenvolvimento

- **Java SE Development Kit (JDK)**: Ambiente de desenvolvimento Java.
- **IntelliJ IDEA** ou **Eclipse IDE**: IDE recomendada para desenvolvimento em Java.

---

# Requisitos para Instalação

- **Java SE Development Kit (JDK) 8 ou superior**: [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- **IntelliJ IDEA ou Eclipse**: [Download IntelliJ](https://www.jetbrains.com/idea/download/) ou [Download Eclipse](https://www.eclipse.org/downloads/)

---

# Instalação

1. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/GAMELEIRA/studies-backend.git
   ```

2. **Importar o Projeto na IDE**:

   - Abra o **IntelliJ IDEA** ou **Eclipse**.
   - Selecione `File > Open` e navegue até o caminho:

     ```
     studies-backend/01-fundamentals/02-concepts/01-oop/06-polymorphism/01-examples/01-payments-system
     ```

   - Aguarde a importação do projeto.

---

# Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
payments-system/
│── src/
│   ├── org/gameleira/app/
│   │   ├── App.java           # Classe principal
│   ├── org/gameleira/models/
│   │   ├── Payment.java       # Classe abstrata base
│   │   ├── CreditCard.java    # Classe que representa pagamento com cartão
│   │   ├── Pix.java           # Classe que representa pagamento via Pix
│   │   ├── BankSlip.java      # Classe que representa pagamento por boleto
└── README.md
```

---

# Uso

## Compilar o Projeto:
- No **IntelliJ IDEA** ou **Eclipse**, clique com o botão direito na classe `Main.java` e selecione **Run**.

## Interagir com o Sistema:
- O console exibirá as mensagens de cada tipo de pagamento sendo processado.

### Exemplo de saída:
```
Processing R$100.0 via Credit Card...
Processing R$100.0 via Pix...
Processing R$100.0 via Boleto...
```

---

# Apoiar

Feedbacks e sugestões são bem-vindos! Para contribuir ou relatar problemas, **abra uma issue** no repositório.

---

# Autores e Agradecimentos

Desenvolvido por **Gabriel Gameleira dos Santos**.  
Agradecimentos especiais a todos que contribuíram para o desenvolvimento deste projeto.

---

# Licença

Este projeto é licenciado sob a **licença MIT**. Consulte o arquivo `LICENSE` para mais detalhes.

---

# Status do Projeto

O projeto está **concluído** como exemplo conceitual.