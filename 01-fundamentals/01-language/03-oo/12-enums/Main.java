public class Main {
  public static void main(String[] args) {
    Level level = Level.MEDIUM;
    System.out.println(level);

    //LEVELS RETORNA UM ARRAY DE TODAS AS CONTANTES ENUM
    for (Level myVar: Level.values()) {
      System.out.println(myVar);
    }
  }  
}
