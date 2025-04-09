public class Food {

  //O ENCAPSULAMENTO GARANTE QUE OS DADOS SENIVEIS SEJAM OCULTADOS DOS USUARIOS
  //PARA ISSO DEVEMOS DECLARAR ATRIBUTOS DE CLASSES COMO PRIVADOS
  //FORNECER METODOS get e set PARA ACESSAR E ATUALIZAR O VALOR DE UMA VARIAVEL
  private String name;

  //GETTER
  //RETORNA O VALOR DO ATRIBUTO name
  public String getName() {
    return this.name;
  }

  //SETTER
  //ATUALIZA O VALOR DO ATRIBUTO name
  public void setName(String name) {
    this.name = name;
  }
  
}
