
# Math Utils – `static` Keyword

Este repositório contém a implementação de uma classe utilitária de matemática, demonstrando a aplicação da palavra-chave **`static`** em Java para métodos utilitários que não dependem de instâncias de objetos.

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

O projeto **Math Utils** foi criado para demonstrar o uso da palavra-chave `static` em Java, onde métodos são chamados diretamente da classe, sem a necessidade de criar objetos.

Este sistema foca em:

- Criação de uma classe de utilitários matemáticos com **métodos estáticos**.
- Demonstração de chamadas diretas aos métodos sem instanciar a classe.
- Prática com operações matemáticas básicas: soma, subtração, multiplicação e divisão.

---

# Conceitos Abordados

## Classe: `MathUtils`

- `add(int a, int b)`: Método estático para somar dois números.
- `subtract(int a, int b)`: Método estático para subtrair dois números.
- `multiply(int a, int b)`: Método estático para multiplicar dois números.
- `divide(int a, int b)`: Método estático para dividir dois números.

Todos os métodos são **static**, reforçando o conceito de **utilitários em Java**.

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
     java-studies/01-fundamentals/02-concepts/01-oop/07-other-resources/06-static/01-examples/01-math-utils
     ```

   - Aguarde a importação do projeto.

---

# Estrutura do Projeto

```
math-utils/
│── src/
│   ├── org/gameleira/app/
│   │   ├── App.java                 # Classe principal de execução
│   │   ├── MathUtils.java           # Classe utilitária com métodos estáticos
└── README.md
```

---

# Uso

## Executar o Projeto:
- No **IntelliJ IDEA** ou **Eclipse**, clique com o botão direito na classe `App.java` e selecione **Run**.

## Exemplo de saída:
```
5 ao quadrado: 25
3 ao cubo: 27
fatorial de 4: 24
8 é par? true
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

O projeto está **concluído** como exemplo educacional sobre o uso de `static` em Java.
