package _4_exception._2_part;

public class Grade {
    private int grade;

    public Grade(int grade) {
        if (grade < 1 || grade > 10) {
            throw new IllegalArgumentException("Grade must be between 1 and 10.");
        }

        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }
}