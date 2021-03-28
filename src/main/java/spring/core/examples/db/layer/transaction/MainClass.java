package spring.core.examples.db.layer.transaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("db\\transaction\\BeanConfiguration.xml");

//    CustomerDAO custDao = context.getBean("customerDAO", CustomerDAO.class);
    CustomerManager custManager = context.getBean("customerManager", CustomerManager.class);
    
    Customer customer = new Customer();
    customer.setId(10);
    customer.setName("Gaurav");
    Address address = new Address();
    address.setAddress("Noida");
    address.setCountry("India");
    address.setId(11);
    customer.setAdress(address);
    
    //Without transaction management
    //custDao.create(customer);
    
    //With Spring transaction management
    custManager.createCustomerRecord(customer);
    context.close();
  }

}
