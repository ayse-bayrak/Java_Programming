package day06_ifStatements;

public class GradeLevel2Task5 {
    public static void main(String[] args) {
        int gradeLevel = 9;
        String result=""; // temporary value

        if (gradeLevel >= 6 && gradeLevel <= 8) {
            result= "Middle school";
        }
        if (gradeLevel >= 9 && gradeLevel <= 12)
        {
            result = "High school";
        }

        if (gradeLevel >= 13 && gradeLevel <= 16)
        {
            result = "Collage";
        }

        if (gradeLevel >= 17 && gradeLevel <= 18)
        {
            result = "Grad school";
        }

        System.out.println(result);
    }
}
