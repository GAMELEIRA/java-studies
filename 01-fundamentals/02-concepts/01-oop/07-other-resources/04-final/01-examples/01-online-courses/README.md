# Online Courses – `final` Keyword

Este repositório contém a implementação de um sistema de cursos online, aplicando os conceitos da palavra-chave **`final`** em Java para atributos, métodos e classes.

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

O projeto **Online Courses** tem como objetivo demonstrar o uso da palavra-chave `final` em Java em diferentes contextos, por meio da simulação de um sistema de gerenciamento de cursos e certificados.

Este sistema foca em:

- Criação de classes com **atributos imutáveis** usando `final`.
- Métodos que **não podem ser sobrescritos**.
- Classes que **não podem ser estendidas**.
- Demonstração prática de herança e restrições impostas pelo uso de `final`.

---

# Conceitos Abordados

## Classe: `Course`

- `name`: Nome do curso (**final**, imutável)
- `workload`: Pode ser alterado com método público
- `initializeCourse()`: Método **final**, não pode ser sobrescrito
- Classe é `final`: **não pode ser estendida**

## Classe: `Certificate`

- `generatedCertificate()`: Pode ser sobrescrito por subclasses
- `versionCertificate()`: Método **final**, não pode ser sobrescrito

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
     java-studies/01-fundamentals/02-concepts/01-oop/07-other-resources/04-final/01-examples/01-online-courses
     ```

   - Aguarde a importação do projeto.

---

# Estrutura do Projeto

```
online-courses/
│── src/
│   ├── org/gameleira/app/
│   │   ├── App.java             # Classe principal de execução
│   ├── org/gameleira/models/
│   │   ├── Course.java                 # Classe final com atributo e método final
│   │   ├── Certificate.java          # Classe base com método final
└── README.md
```

---

# Uso

## Executar o Projeto:
- No **IntelliJ IDEA** ou **Eclipse**, clique com o botão direito na classe `Principal.java` e selecione **Run**.

## Exemplo de saída:
```
Curso Java Avançado iniciado!
Carga horária atual: 45

--- Certificado padrão ---
Certificado gerado.
Versão padrão do certificado.
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

O projeto está **concluído** como exemplo educacional sobre o uso de `final` em Java.
