package day28_encapsulation.encapsulation;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        //student.age = -200; // do not access private modifiers

        student.setAge(28);
        System.out.println(student.getAge());// to read

        student.setName("Ayse");  // for set
        System.out.println(student.getName());  // for read
    }
}
