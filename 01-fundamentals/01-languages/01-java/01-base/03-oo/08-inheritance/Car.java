//extends É UMA PALAVRA RESERVADA PARA HERDAR CARACTERISTICAS DE UMA OUTRA CLASSE
//COM O RECURSO DA HERANCA PODEMO0S ECONOMIZAR TEMPO AO REAPROVEITAR CODIGO
public final class Car extends Vehicle {

  public Car() {
    setName("Ford");
  }

  public void setName(String newName) {
    this.name = newName;
  }
}