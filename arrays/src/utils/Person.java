package utils;

public class Person {

  private Integer id;
  private String name;
  private Double salary;

  public Person(Integer id, String name, Double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return this.salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return ("name:" + getName() + "\n" + "salary:" + getSalary() + "\n");
  }
}
