package spring.core.examples.db.layer.transaction;

public class Customer {
  private Integer id;
  private String name;
  private Address adress;

  public Address getAdress() {
    return adress;
  }

  public void setAdress(Address adress) {
    this.adress = adress;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.id + ":" + this.name + ":" + this.adress.getId() + ":" + this.adress.getAddress()
        + ":" + this.getAdress().getCountry();
  }
}
