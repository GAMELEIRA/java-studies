//ABSTRACAO É CONCEITO DE ESCONDER DETALHES IRRELEVANTES E MOSTRAR APENAS O ESSENCIAL AO USUARIO
//A ABSTRACAO PODE SER ALCANÇADA COM CLASSES ABSTRATAS OU INTERFACES

public class Main {
  public static void main(String[] args) {
    Animal dog = new Dog();
    dog.animalSound();
    dog.eat();
  }
}
