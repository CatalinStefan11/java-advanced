package _4_hashset._1_;

/*
    Exercise: Student Management System
    You are tasked with building a student management system for a university. 
    The system should store information about each student, including their name, ID, and a list of courses they are enrolled in. 
    You decide to use a HashSet to store the list of courses for each student.

    Requirements:
    
    Create a class Course that has the following properties:
    -> id (int): a private field representing the unique identifier of the course.
    -> name (String): a private field representing the name of the course.
    -> description (String): a private field representing the description of the course.
    -> credit (int): a private field representing the credit of the course.
    -> a constructor that takes in an int representing the course ID, a String representing the course name, 
          a String representing the course description, and an int representing the course credit, and initializes 
          the corresponding fields accordingly.
    -> getId(): a method that returns the ID of the course.
    -> getName(): a method that returns the name of the course.
    -> getDescription(): a method that returns the description of the course.
    -> getCredit(): a method that returns the credit of the course.
    -> equals(Object obj): an overridden method that compares the id, name, description, and credit fields 
          of two Course objects for equality.
    -> hashCode(): an overridden method that uses the id, name, description, and credit fields in 
          its calculation for generating hash code.
   
    Create a student class with the following:
    -> id (int): a private field representing the unique identifier of the student.
    -> name (String): a private field representing the name of the student.
    -> courses (HashSet<Course>): a private field representing the set of courses that the student is currently enrolled in.
    -> a constructor that takes in an int representing the student ID and a String representing the student name, and initializes the id and name fields accordingly.
    -> enroll(Course course): a method that takes in a Course object representing the course that the student wants to enroll in, and adds it to the courses set.
    -> drop(Course course): a method that takes in a Course object representing the course that the student wants to drop, and removes it from the courses set.
    -> getCourses(): a method that returns the set of courses that the student is currently enrolled in.

 */


public class Main {
  public static void main(String[] args) {
    // create courses
    Course math = new Course(1, "Math", "This is a math course", 3);
    Course history = new Course(2, "History", "This is a history course", 3);
    Course science = new Course(3, "Science", "This is a science course", 4);

    // create students
    Student alice = new Student(1, "Alice");
    Student bob = new Student(2, "Bob");
    Student charlie = new Student(3, "Charlie");

    // enroll students in courses
    alice.enroll(math);
    alice.enroll(history);
    bob.enroll(math);
    bob.enroll(science);
    charlie.enroll(history);
    charlie.enroll(science);

    // display each student's enrolled courses
    System.out.println(alice.getName() + "'s enrolled courses:");
    for (Course course : alice.getCourses()) {
      System.out.println(course.getName());
    }

    System.out.println(bob.getName() + "'s enrolled courses:");
    for (Course course : bob.getCourses()) {
      System.out.println(course.getName());
    }

    System.out.println(charlie.getName() + "'s enrolled courses:");
    for (Course course : charlie.getCourses()) {
      System.out.println(course.getName());
    }
  }
}
