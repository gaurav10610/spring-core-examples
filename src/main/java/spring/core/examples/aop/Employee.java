package spring.core.examples.aop;

public class Employee {

  String name;

  public String getName() {
    return name;
  }

  @Loggable
  public void setName(String name) {
    this.name = name;
  }

  public void throwException() {
    throw new RuntimeException("Dummy Exception");
  }
}
