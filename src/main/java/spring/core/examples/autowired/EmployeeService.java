package spring.core.examples.autowired;

public class EmployeeService {

  private Employee employee;

  public EmployeeService(Employee employee) {
    System.out.println("Autowiring by constructor used");
    this.employee = employee;
  }

  // default constructor to avoid BeanInstantiationException for autowire
  // byName or byType
  public EmployeeService() {
    System.out.println("Default Constructor used");
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
}
