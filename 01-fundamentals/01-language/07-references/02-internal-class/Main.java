//CLASSES ANINHADAS É UM RECURSO UTILIZADO PARA AGRUPAR CLASSES QUE PERTENCEM UMAS AS OUTRAS
class Monster {
  String name = "Komodo";

  class LittleMonster {
    String name = "Lagartixa";
  }
}

class BigMonster {
  String name = "Komodo";

  // NAO PRECISA INSTANCIAR PARA USAR A CLASSE
  static class LargeMonster {
    String name = "Lagartixa";
  }
}

public class Main {
  public static void main(String[] args) {
    Monster monster = new Monster();
    Monster.LittleMonster littleMonster = monster.new LittleMonster();

    System.out.println("Primeiro monstro: " + monster.name);
    System.out.println("Pequeno monstro: " + littleMonster.name);

    BigMonster.LargeMonster largeMonster = new BigMonster.LargeMonster();
    System.out.println(largeMonster.name);
  }
}
