public class Vehicle {
  public String name;
  public int year = 2021;
  
  public void getDetails() {
    System.out.println("Name: " + name + ", Year: " + year);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
