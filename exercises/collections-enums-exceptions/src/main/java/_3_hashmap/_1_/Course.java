package _3_hashmap._1_;

import java.util.HashMap;
import java.util.Map;

class Course {
  private String name;
  private Map<Student, Integer> studentScores;

  public Course(String name) {
    this.name = name;
    this.studentScores = new HashMap<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addStudentScore(Student student, int score) {
    studentScores.put(student, score);
  }

  public int getStudentScore(Student student) {
    return studentScores.get(student);
  }
}