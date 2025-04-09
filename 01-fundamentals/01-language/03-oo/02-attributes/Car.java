public class Car {

  //ATRIBUTOS SAO CARACTERISTICAS DE UMA CLASSE
  //OS ATRIBUTOS SAO ESTRUTURADOS COM MODIFICADORES, TIPO, IDENTIFICADOR E ATRIBUICAO DO VALOR
  public String color = "black";
  private int velocity = 0;
  
  public String accelerate() {
    this.velocity += 5;
    return "Acelerando..." + this.velocity + "Km";
  }
  
}
