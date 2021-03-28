package spring.core.examples.db.layer.transaction;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAOImpl implements CustomerDAO {

  private DataSource dataSource;

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void create(Customer customer) {
    String custQuery = "insert into Customer (id,name) values (?,?)";
    String addressQuery = "insert into Address (id,address,country) values (?,?,?)";

    JdbcTemplate template = new JdbcTemplate(dataSource);

    template.update(custQuery, new Object[] {customer.getId(), customer.getName()});

    template.update(addressQuery, new Object[] {customer.getAdress().getId(),
        customer.getAdress().getAddress(), customer.getAdress().getCountry()});
    System.out.println("Successfully updated customer records::::" + customer);
  }

}
