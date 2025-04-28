# Gerar o arquivo README completo para Documents Management
conteudo_readme_documents_completo = """
# Documents Management – `sealed` Keyword

Este repositório contém a implementação de um sistema de gerenciamento de documentos, demonstrando a aplicação da palavra-chave **`sealed`** em Java para controlar a herança de classes.

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

O projeto **Documents Management** tem como objetivo demonstrar o uso da palavra-chave `sealed` em Java, permitindo definir um conjunto restrito de classes que podem estender uma classe base.

Este sistema foca em:

- Criação de uma classe base **selada** (`sealed`) que limita quais classes podem estendê-la.
- Demonstração prática da **restrição de herança** em um cenário de gestão de documentos.
- Aplicação de conceitos modernos da linguagem Java (a partir do Java 17).

---

# Conceitos Abordados

## Classe: `Document` (sealed)

- Classe base `sealed`.
- Permite apenas que `DriverLicense`, `IdentityCard` e `Passport` a estendam.

## Subclasses Autorizadas

- `DriverLicense` — Representa uma carteira de motorista.
- `IdentityCard` — Representa um cartão de identidade.
- `Passport` — Representa um passaporte.

Cada documento implementa seu próprio método de validação, ilustrando a utilização da herança restrita.

---

# Visuais

Este projeto não possui interface gráfica. As interações são feitas exclusivamente via **console**.

---

# Ferramentas de Desenvolvimento

- **Java SE Development Kit (JDK) 17 ou superior**
- **IntelliJ IDEA** ou **Eclipse IDE** (com suporte para Java 17+)

---

# Requisitos para Instalação

- **Java JDK 17 ou superior**: [Download JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- **IntelliJ IDEA ou Eclipse**: [Download IntelliJ](https://www.jetbrains.com/idea/download/) ou [Download Eclipse](https://www.eclipse.org/downloads/)

---

# Instalação

1. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/GAMELEIRA/java-studies.git

2. **Importar o Projeto na IDE**:

   - Abra o **IntelliJ IDEA** ou **Eclipse**.
   - Selecione `File > Open` e navegue até o caminho:

     ```
     java-studies/01-fundamentals/02-concepts/01-oop/07-other-resources/05-sealed/01-examples/01-documents-management
     ```

   - Aguarde a importação do projeto.

---

# Estrutura do Projeto

```
documents-management/
│── src/
│   ├── org/gameleira/app/
│   │   ├── App.java               # Classe principal de execução
│   ├── org/gameleira/models/
│   │   ├── Document.java           # Classe sealed base
│   │   ├── DriverLicense.java      # Subclasse autorizada
│   │   ├── IdentityCard.java       # Subclasse autorizada
|   |   |── Passport.java           # Subclasse autorizada
└── README.md
```

---

# Uso

## Executar o Projeto:
- No **IntelliJ IDEA** ou **Eclipse**, clique com o botão direito na classe `App.java` e selecione **Run**.

## Exemplo de saída:
```
Validando passaporte: verifique o país e a data de validade
Validação do Cartão de Identidade: Verifique o número do documento de identidade e a data de nascimento
Validando passaporte: verifique o país e a data de validade
```

---

# Apoiar

Feedbacks, sugestões e contribuições são bem-vindos! Para contribuir ou relatar problemas, **abra uma issue** no repositório.

---

# Autores e Agradecimentos

Desenvolvido por **Gabriel Gameleira dos Santos**.  
Agradecimentos especiais a todos que colaboram com estudos Java na comunidade.

---

# Licença

Este projeto está licenciado sob a **licença MIT**. Consulte o arquivo `LICENSE` para mais informações.

---

# Status do Projeto

O projeto está **concluído** como exemplo educacional sobre o uso de `sealed` em Java.
