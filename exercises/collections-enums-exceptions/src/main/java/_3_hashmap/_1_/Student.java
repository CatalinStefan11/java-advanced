package _3_hashmap._1_;

import java.util.Objects;

class Student {
  private int id;
  private String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Student)) {
      return false;
    }
    Student student = (Student) o;
    return id == student.id &&
        Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}
