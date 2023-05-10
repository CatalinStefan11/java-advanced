package _3_hashmap._4_;

import java.util.List;
import java.util.Map;

/*
Create a class called "Student" with the following properties: name, age, and major. 
Include getters and setters for each property.

Create a class called "Course" with the following properties: name, instructor, and capacity. 
Include getters and setters for each property.

Create a class called "University" with the following properties: name and a HashMap that maps a 
Course object to a list of Student objects. Include getters and setters for each property, as well as a method called 
"registerStudent" that takes in a Student object and a Course object, and adds the Student to the list of students for that course. 
The method should return true if the registration was successful (i.e. the course is not full), and false otherwise.

Create a class called "Main" that creates a University object and several Student and Course objects. 
Register some students for courses and print out the contents of the University's HashMap to verify that the registration was successful.


 */

public class Main {
  public static void main(String[] args) {
    // Create some courses
    Course math = new Course("Math", "Dr. Smith", 30);
    Course science = new Course("Science", "Dr. Johnson", 20);

    // Create some students
    Student alice = new Student("Alice", 19, "Mathematics");
    Student bob = new Student("Bob", 20, "Biology");
    Student charlie = new Student("Charlie", 18, "Computer Science");

    // Create a university
    University university = new University("My University");

    // Register students for courses
    university.registerStudent(alice, math);
    university.registerStudent(bob, science);
    university.registerStudent(charlie, math);

    // Print out the course and student information
    Map<Course, List<Student>> courseMap = university.getCourseMap();
    for (Map.Entry<Course, List<Student>> entry : courseMap.entrySet()) {
      Course course = entry.getKey();
      List<Student> students = entry.getValue();
      System.out.println("Course: " + course.getName() + " (" + course.getInstructor() + ")");
      System.out.println("Enrollment: " + students.size() + " / " + course.getCapacity());
      System.out.println("Students:");
      for (Student student : students) {
        System.out.println("- " + student.getName() + " (" + student.getMajor() + ")");
      }
      System.out.println();
    }
  }
}