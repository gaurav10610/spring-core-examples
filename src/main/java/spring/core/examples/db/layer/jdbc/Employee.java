package spring.core.examples.db.layer.jdbc;

public class Employee {

  private Integer id;

  private String name;

  private String role;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "{ID=" + id + ",Name=" + name + ",Role=" + role + "}";
  }
}
