# Estados Brasileiros

Este repositório contém a implementação de um sistema que exemplifica o uso de **Enums** em Java para representar os estados do Brasil.

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

O projeto **Estados Brasileiros** demonstra o uso de **Enums (Enumerações)** em Java para representar os estados do Brasil, fornecendo informações como:

- Nome do Estado
- Sigla (UF)
- Região correspondente

## Estrutura dos Dados

O Enum **BrazilianStates** contém as seguintes propriedades:

- `name`: Nome do estado
- `abbreviation`: Sigla do estado (UF)
- `region`: Região do Brasil onde o estado está localizado

## Visuais

Atualmente, o projeto não possui interfaces gráficas ou representações visuais. Todas as interações são feitas via console.

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
   - Navegue até o diretório `studies-backend/01-fundamentals/02-concepts/01-oop/02-enums/01-examples/01-states-brazilians` e importe o projeto.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **`src/com/gameleira/01-states-brazilians/enums`**: Contém os enums principais do sistema:
  - `BrazilianStates.java`: Enum que define os estados brasileiros e suas regiões.
  - `StateTest.java`: Classe principal com exemplos de uso do Enum.

## Uso

Para executar o sistema:

1. **Compilar o Projeto**:
   - No Eclipse, clique com o botão direito no projeto e selecione `Run As` > `Java Application`.

2. **Interagir com o Sistema**:
   - O console exibirá os estados brasileiros e suas respectivas regiões.

## Apoiar

Feedbacks e sugestões são bem-vindos! Para contribuir ou relatar problemas, por favor, abra uma issue no repositório.

## Autores e Agradecimentos

Desenvolvido por [Gabriel Gameleira dos Santos](https://www.linkedin.com/in/gabriel-gameleira-dos-santos-634b23161/). Agradecimentos especiais a todos que contribuíram para o desenvolvimento deste projeto.

## Licença

Este projeto é licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

## Status do Projeto

O projeto está em desenvolvimento contínuo, com planos para futuras melhorias, incluindo:

- Implementação de testes unitários.
- Melhorias na exibição de dados via interface gráfica.
- Integração com APIs externas para obtenção de informações sobre estados brasileiros.

Acompanhe as atualizações e contribua para o aprimoramento do sistema!
