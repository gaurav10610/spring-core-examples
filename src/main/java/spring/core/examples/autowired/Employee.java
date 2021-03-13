package spring.core.examples.autowired;

public class Employee {

  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void throwException() {
    throw new RuntimeException("Dummy Exception");
  }
}
