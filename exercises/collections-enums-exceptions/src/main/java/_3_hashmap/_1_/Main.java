package _3_hashmap._1_;

/*
  - Define a Student class with id and name fields and a constructor that initializes these fields.
  - Override the equals() and hashCode() methods of the Student class to enable it to be used as a key in a HashMap.
  - Define a Course class with a name field and a Map of Student and Integer objects to store the scores of each student.
  - Define a constructor for the Course class that takes a name as a parameter and initializes the studentScores map.
  - Define a method to add a student score to the studentScores map of the Course class, which takes a Student object and an int score as parameters.
  - Define a method to get a student score from the studentScores map of the Course class, which takes a Student object as a parameter and returns the corresponding score.
  - In the Main class, create some Student and Course objects, add some student scores to the courses, and print the scores. 

 */

public class Main {

  public static void main(String[] args) {
    Student s1 = new Student(1, "Alice");
    Student s2 = new Student(2, "Bob");

    Course c1 = new Course("Java Programming");
    c1.addStudentScore(s1, 85);
    c1.addStudentScore(s2, 90);

    System.out.println("Student " + s1.getName() + " scored " + c1.getStudentScore(s1) + " in " + c1.getName());
    System.out.println("Student " + s2.getName() + " scored " + c1.getStudentScore(s2) + " in " + c1.getName());
  }
}
