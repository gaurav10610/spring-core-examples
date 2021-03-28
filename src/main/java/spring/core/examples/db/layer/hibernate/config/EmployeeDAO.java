package spring.core.examples.db.layer.hibernate.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDAO {

  private HibernateTemplate template;

  public void setHibernateTemplate(HibernateTemplate template) {
    this.template = template;
  }

  // method to save employee
  public void saveEmployee(Employee e) {
    template.save(e);
  }

  // method to update employee
  public void updateEmployee(Employee e) {
    template.update(e);
  }

  // method to delete employee
  public void deleteEmployee(Employee e) {
    template.delete(e);
  }

  // method to return one employee of given id
  public Employee getById(int id) {
    Employee e = (Employee) template.get(Employee.class, id);
    return e;
  }

  // method to return all employees
  public List<Employee> getEmployees() {
    List<Employee> list = new ArrayList<Employee>();
    list = template.loadAll(Employee.class);
    return list;
  }
}
