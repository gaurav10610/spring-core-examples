package spring.core.examples.db.layer.hibernate.annotation;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
  public static void main(String[] args) {
    
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("db\\hibernate\\annotation\\BeanConfiguration.xml");

    PersonDAO personDAO = context.getBean(PersonDAO.class);

    Person person = new Person();
    person.setName("Gaurav");
    person.setCountry("India");

    personDAO.save(person);

    System.out.println("Person::" + person);

    List<Person> list = personDAO.getList();

    for (Person p : list) {
      System.out.println("Person List::" + p);
    }
    // close resources
    context.close();
  }
}
