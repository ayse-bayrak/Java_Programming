package day32_finalKeyword.personTask;

import java.time.LocalDate;

public final class Student extends Person{ // since it wwill be parent, we should apply final

    private char grade;
    private final int studentId;  // final variable so it has not setter

    public Student(String name, char gender, LocalDate dateOfBirth, char grade, int studentId) {
        super(name, gender, dateOfBirth);
        this.grade = grade;
        if (! (studentId > 0) ) {
            throw new RuntimeException("Invalid " + studentId);
        } // since variable is final, it has not setter, and we have to add restriction in constructor,
        this.studentId = studentId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

}
