package spring.core.examples.db.layer.hibernate.annotation;

import java.util.List;

public interface PersonDAO {

  public void save(Person person);
  
  public List<Person> getList();
}
