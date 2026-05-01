package Finals.Exceptions.Activity;

public class InvalidGradeException extends Exception {
    private double grade;

    public InvalidGradeException(double grade, String message) {
        super(message);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
}
