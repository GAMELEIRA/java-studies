package models;

public class Account {
  public String agency; 
  public int number;
  public double balance;
  public User user;

  public Account() {}

  public Account(String agency, int number, double balance, User user) {
    this.agency = agency;
    this.number = number;
    this.balance = balance;
    this.user = user;
  }

  @Override
  public String toString() {
    return "Account [agency=" + agency + ", number=" + number + ", balance=" + balance + "]";
  }

  
}
