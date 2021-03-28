package spring.core.examples.db.layer.hibernate.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("db\\hibernate\\config\\BeanConfiguration.xml");
    EmployeeDAO dao = context.getBean("dao",EmployeeDAO.class);

    Employee e = new Employee();
    e.setId(114);
    e.setName("varun");
    e.setSalary(50000);

    dao.saveEmployee(e);
    context.close();
  }

}
