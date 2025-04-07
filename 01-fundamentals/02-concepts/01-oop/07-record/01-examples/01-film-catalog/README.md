
# Film Catalog

Este repositório contém a implementação de um sistema de catálogo de filmes, aplicando os conceitos de **Records** em Java, introduzidos no Java 14+.

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

O projeto **Film Catalog** tem como objetivo demonstrar o uso de **records** em Java — um tipo especial de classe imutável, ideal para modelagem de dados simples.

Este sistema simula um catálogo de filmes com os seguintes focos:

- Criação de registros (`record`) representando filmes, diretores e gêneros.
- Demonstração de como `records` podem ser usados para compor dados imutáveis.
- Exploração da simplicidade e concisão dos `records` frente às classes tradicionais.

---

# Estrutura dos Dados

## Record: `Movie`
Representa um filme com os seguintes atributos:

- `title`: Título do filme
- `year`: Ano de lançamento
- `durationMinutes`: Duração em minutos
- `gender`: Gênero do filme (composição)
- `director`: Diretor do filme (composição)

## Record: `Director`
Informações sobre o diretor:

- `name`: Nome
- `age`: Idade
- `nationality`: Nacionalidade

## Record: `Gender`
Representa o gênero do filme:

- `name`: Nome do gênero
- `description`: Descrição geral do gênero

---

# Visuais

Este projeto não possui interface gráfica. As interações são feitas exclusivamente via **console**.

---

# Ferramentas de Desenvolvimento

- **Java SE Development Kit (JDK) 16 ou superior**: Necessário para suporte completo a `record`.
- **IntelliJ IDEA** ou **Eclipse IDE**: IDEs recomendadas para desenvolvimento em Java.

---

# Requisitos para Instalação

- **Java SE Development Kit (JDK) 16 ou superior**: [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
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
     studies-backend/01-fundamentals/02-concepts/01-oop/07-record/01-examples/01-film-catalog
     ```

   - Aguarde a importação do projeto.

---

# Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
film-catalog/
│── src/
│   ├── org/gameleira/app/
│   │   ├── Main.java            # Classe principal de execução
│   ├── org/gameleira/models/
│   │   ├── Movie.java           # Record representando um filme
│   │   ├── Director.java        # Record representando um diretor
│   │   ├── Gender.java          # Record representando um gênero
└── README.md
```

---

# Uso

## Compilar o Projeto:
- No **IntelliJ IDEA** ou **Eclipse**, clique com o botão direito na classe `Main.java` e selecione **Run**.

## Interagir com o Sistema:
- O console exibirá os filmes cadastrados e seus detalhes.

### Exemplo de saída:
```
Movie[title=Minecraft, year=2025, durationMinutes=120, gender=Gender[name=Aventura, description=Descobertas], director=Director[name=Gabriel, age=25, nationality=Brasil]]
Movie[title=Entre Estações, year=2018, ...]
...
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

O projeto está **concluído** como exemplo conceitual sobre o uso de `record` em Java.
