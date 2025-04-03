# Vehicle Management

Este repositório contém a implementação de um sistema de gerenciamento de veículos, aplicando os conceitos de Herança em Java.

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

# Descrição

O projeto **Vehicle Management** implementa um sistema para gerenciamento de diferentes tipos de veículos, permitindo:

- Cadastro de veículos
- Listagem de veículos cadastrados
- Busca de veículo por placa
- Exibição de informações de cada veículo

O foco do projeto é demonstrar o conceito de **Herança**, onde uma classe `Vehicle` serve como base para outras classes como `Car`, `Motorcycle` e `Truck`.

# Estrutura dos Dados

A classe `Vehicle` é a superclasse e contém os seguintes atributos:

- `brand`: Marca do veículo
- `model`: Modelo do veículo
- `yearOfManufacture`: Ano de fabricação
- `licensePlate`: Placa do veículo

As classes derivadas possuem atributos específicos:

- **Car**: `quantityDoors` (quantidade de portas)
- **Motorcycle**: `cylinderCapacity` (capacidade do motor em cc)
- **Truck**: `loadCapacity` (capacidade de carga em toneladas)

Cada classe implementa seu método `toString()` para exibir suas informações de forma formatada.

# Visuais

Atualmente, o projeto **não possui interfaces gráficas** ou representações visuais. Todas as interações são feitas via console.

# Ferramentas de Desenvolvimento

As seguintes ferramentas foram utilizadas para desenvolver e executar este projeto:

- **Java SE Development Kit (JDK)**: Ambiente de desenvolvimento Java.
- **IntelliJ IDEA** ou **Eclipse IDE**: IDE recomendada para edição e execução do código.

# Requisitos para Instalação

Antes de executar o projeto, certifique-se de ter instalado:

- **Java SE Development Kit (JDK) 8 ou superior**: [Download JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- **IntelliJ IDEA ou Eclipse**: [Download IntelliJ](https://www.jetbrains.com/idea/) ou [Download Eclipse](https://www.eclipse.org/downloads/)

# Instalação

1. **Clonar o Repositório**:

   ```sh
   git clone https://github.com/GAMELEIRA/studies-backend.git
   ```

2. **Importar o Projeto na IDE**:

   - Abra o **IntelliJ IDEA** ou **Eclipse**.
   - Selecione **File > Open** e navegue até o caminho:

     ```
     studies-backend/01-fundamentals/02-concepts/01-oop/04-inheritance/01-examples/01-vehicles-management
     ```
   - Aguarde a importação do projeto.

# Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
vehicles-management/
│── src/
│   ├── org/gameleira/models/
│   │   ├── Vehicle.java     # Classe base para os veículos
│   │   ├── Car.java         # Classe que representa um carro
│   │   ├── Motorcycle.java  # Classe que representa uma motocicleta
│   │   ├── Truck.java       # Classe que representa um caminhão
│   ├── org/gameleira/app/
│   │   ├── App.java         # Classe principal que executa a aplicação
└── README.md
```

# Uso

1. **Compilar o Projeto**:

   - No **IntelliJ IDEA** ou **Eclipse**, clique com o botão direito na classe `App.java` e selecione **Run**.

2. **Interagir com o Sistema**:

   - O console exibirá as informações dos veículos cadastrados e permitirá a busca por placa.

# Apoiar

Feedbacks e sugestões são bem-vindos! Para contribuir ou relatar problemas, abra uma **issue** no repositório.

# Autores e Agradecimentos

Desenvolvido por **Gabriel Gameleira dos Santos**.

# Licença

Este projeto é licenciado sob a **licença MIT**. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

# Status do Projeto

O projeto está **finalizado**, podendo ser expandido no futuro.