package day26_static.studentTask;

public class Student {// the class defines how the object will behave and what the object will contain
        // declare attributes
    // if you want to be able to store different names for the different objects of student, ut should be instance
    public String name, id;
    public int age;
    public char gender;

    public Student(String name, int age, char gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;

    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
