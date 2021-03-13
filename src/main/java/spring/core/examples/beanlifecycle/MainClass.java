package spring.core.examples.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("data\\beanlifecycle\\BeanConfiguration.xml");

    System.out.println("Spring Context initialized");

    EmployeeService service = context.getBean("employeeService", EmployeeService.class);

    System.out.println("Bean retrieved from Spring Context");

    System.out.println("Employee Name=" + service.getEmployee().getName());
    
    MyEmployeeService myEmployeeService = context.getBean(MyEmployeeService.class);
    System.out.println("MyEmployeeService Name=" + myEmployeeService.getEmployee().getName());

    // Spring aware objects usage service
    MyAwareService awareService = context.getBean("myAwareService", MyAwareService.class);

    context.close();

    System.out.println("Spring context has been closed.");
  }

}
