package models;

public class User {
  public String name;
  public Account account;

  public User () {}

  public User(String name) {
    this.name = name;
  }

  public User(String name, Account account) {
    this.name = name;
    this.account = account;
  }

  @Override
  public String toString() {
    return "User [name=" + name + ", account=" + account + "]";
  }
  
}
