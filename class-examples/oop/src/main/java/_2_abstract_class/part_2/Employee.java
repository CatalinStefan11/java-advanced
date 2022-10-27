package _2_abstract_class.part_2;

public class Employee extends Person {

  private String companyName;
  private boolean isWorking;

  public Employee(String name, String gender, String companyName, boolean isWorking) {
    super(name, gender);
    this.companyName = companyName;
    this.isWorking = isWorking;
  }

  @Override
  public void work() {
    if (isWorking) {
      System.out.println("Working as employee!!");
    } else {
      System.out.println("Not working");
    }
  }
}
