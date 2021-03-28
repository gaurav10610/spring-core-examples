package spring.core.examples.db.layer.hibernate.annotation;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersonDAOImpl implements PersonDAO {

  private SessionFactory sessionFactory;

  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Override
  //@Transactional
  public void save(Person person) {
    Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();
    session.persist(person);
    tx.commit();
    session.close();
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Person> getList() {
    Session session = sessionFactory.openSession();
    List<Person> personList = session.createQuery("from Person").list();
    session.close();
    return personList;
  }
}
