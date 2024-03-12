package day17_customClass;

public class TestStudentObject {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setInfo("Ayse", "Gunes Bayrak", "035", 41, 153, 72, 100 );
        Student student2 = new Student();
        student2.setInfo("Ziya", "Bayrak", "873", 45, 178, 95, 100);

        System.out.println(student1);
        System.out.println(student2);

        student1.Grade();

    }
}
