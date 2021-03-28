package spring.core.examples.db.layer.transaction;

import org.springframework.transaction.annotation.Transactional;

public class CustomerMangerImpl implements CustomerManager{

  private CustomerDAO customerDAO;

  public void setCustomerDAO(CustomerDAO customerDAO) {
    this.customerDAO = customerDAO;
  }

  @Override
  @Transactional
  public void createCustomerRecord(Customer customer) {
    this.customerDAO.create(customer);
  }

}
