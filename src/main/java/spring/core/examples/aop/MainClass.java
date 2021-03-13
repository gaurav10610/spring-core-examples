package spring.core.examples.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

  public static void main(String[] args) {
    
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("data\\aop\\AopConfig.xml");

    EmployeeService service = context.getBean("employeeService", EmployeeService.class);

    System.out.println(service.getEmployee().getName());

    service.getEmployee().setName("Paras");

    service.getEmployee().throwException();

    context.close();
  }

}
