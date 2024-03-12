package day30_inheritance.typseOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student extends Person {
    // if variable is instance, it is better use private
    private char grade;
    private String studentId;


    public Student(String name, char gender, LocalDate DOB, char grade, String studentId) {
        super(name, gender, DOB);// it is calling the super class constructor
        setGrade(grade);
        setStudentId(studentId );
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(getName()+" is studying");
    }
}
