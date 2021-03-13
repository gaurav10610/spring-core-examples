package spring.core.examples.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeAutowiredByConstructorService {

  private Employee employee;

  @Autowired(required = false)
  public EmployeeAutowiredByConstructorService(@Qualifier("employee") Employee employee) {
    this.employee = employee;
  }

  public Employee getEmployee() {
    return employee;
  }
}
