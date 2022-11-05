package _4_exception._2_part;

public class Main {

  public static void main(String[] args) {

    Grade grade = new Grade(3);
    System.out.println(grade.getGrade());

    Grade illegalGrade = new Grade(22);
  }
}
