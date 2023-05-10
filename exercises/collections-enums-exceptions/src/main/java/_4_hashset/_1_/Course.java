package _4_hashset._1_;

import java.util.Objects;

public class Course {
  private int id;
  private String name;
  private String description;
  private int credit;

  public Course(int id, String name, String description, int credit) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.credit = credit;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getCredit() {
    return credit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Course)) return false;
    Course course = (Course) o;
    return id == course.id && credit == course.credit && Objects.equals(name, course.name) && Objects.equals(description, course.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, credit);
  }
}

