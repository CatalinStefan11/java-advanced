package _2_abstract_class.part_2;

public abstract class Person {

  private String name;
  private String gender;

  public Person(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  //abstract method
  public abstract void work();

  @Override
  public String toString(){
    return "Name: "+this.name+" Gender: "+this.gender;
  }

  public void changeName(String newName) {
    this.name = newName;
  }
}
