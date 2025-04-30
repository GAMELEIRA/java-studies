# Orders System – `Consumer` Interface

Este repositório contém a implementação de um sistema de pedidos utilizando a interface funcional **`Consumer`** da linguagem Java, demonstrando como aplicar programação funcional para processar coleções de objetos de forma flexível e reutilizável.

# Sumário
- [Descrição](#descrição)
- [Conceitos Abordados](#conceitos-abordados)
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

O projeto **Orders System** foi criado com o objetivo de demonstrar o uso prático da interface funcional `Consumer` em Java. Através de um cenário simulado de gerenciamento de pedidos, o projeto mostra como funções podem ser passadas como argumentos e aplicadas sobre listas de objetos.

Este sistema foca em:

- Aplicação de **`Consumer<T>`** para processar objetos do tipo `Order`.
- Demonstração da composição de múltiplas operações com `andThen()`.
- Uso de `forEach()` para iterar de maneira funcional sobre listas.

---

# Conceitos Abordados

## Interface Funcional: `Consumer<T>`

- Representa uma operação que aceita um único argumento e **não retorna resultado**.
- Ideal para operações com efeitos colaterais, como impressão, envio de dados, ou atualização de estado.
- Pode ser **combinada com `andThen()`** para encadear múltiplas ações sobre o mesmo dado.

## Classe: `Order`

- Representa um pedido com atributos como **number**, **client** e **valueTotal**.

## Classe: `Client`

- Representa o cliente associado ao pedido.

---

# Visuais

Este projeto não possui interface gráfica. As interações são feitas exclusivamente via **console**.

---

# Ferramentas de Desenvolvimento

- **Java SE Development Kit (JDK) 8 ou superior**
- **IntelliJ IDEA** ou **Eclipse IDE**

---

# Requisitos para Instalação

- **Java JDK 8 ou superior**: [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- **IntelliJ IDEA ou Eclipse**: [Download IntelliJ](https://www.jetbrains.com/idea/download/) ou [Download Eclipse](https://www.eclipse.org/downloads/)

---

# Instalação

1. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/GAMELEIRA/java-studies.git
   ```

2. **Importar o Projeto na IDE**:

   - Abra o **IntelliJ IDEA** ou **Eclipse**.
   - Selecione `File > Open` e navegue até o caminho:

     ```
     java-studies/01-fundamentals/02-concepts/01-oop/07-other-resources/07-consumer/01-examples/01-oders-system
     ```

   - Aguarde a importação do projeto.

---

# Estrutura do Projeto

```
orders-system/
│── src/
│   ├── org/gameleira/models/
│   │   ├── Client.java             # Classe de modelo para o cliente
│   │   └── Order.java              # Classe de modelo para o pedido
│   ├── org/gameleira/app/
│   │   └── App.java                # Classe principal com aplicação de Consumer
└── README.md
```

---

# Uso

## Executar o Projeto:
- No **IntelliJ IDEA** ou **Eclipse**, clique com o botão direito na classe `App.java` e selecione **Run**.

## Exemplo de saída esperada:
```
Order [number=1, client=Client [name=Gabriel], valueTotal=100.0]
```

---

# Apoiar

Feedbacks, sugestões e contribuições são bem-vindos! Para contribuir ou relatar problemas, **abra uma issue** no repositório.

---

# Autores e Agradecimentos

Desenvolvido por **Gabriel Gameleira dos Santos**.  
Agradecimentos especiais a todos que compartilham conhecimento sobre Java e programação funcional.

---

# Licença

Este projeto está licenciado sob a **licença MIT**. Consulte o arquivo `LICENSE` para mais informações.

---

# Status do Projeto

O projeto está **concluído** como exemplo educacional sobre o uso da interface `Consumer` em Java.