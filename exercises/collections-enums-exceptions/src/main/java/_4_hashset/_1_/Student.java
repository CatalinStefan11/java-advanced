package _4_hashset._1_;

import java.util.HashSet;

public class Student {
  private int id;
  private String name;
  private HashSet<Course> courses;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
    courses = new HashSet<Course>();
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void enroll(Course course) {
    courses.add(course);
  }

  public void drop(Course course) {
    courses.remove(course);
  }

  public HashSet<Course> getCourses() {
    return courses;
  }
}

