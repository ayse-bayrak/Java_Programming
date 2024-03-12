package day17_customClass;

public class Student {

    public String name;
    public String lastName;
    public String id;
    public int age;
    public double size;
    public double weight;
    public int score;

    public void setInfo(String name, String lastName, String id, int age, double size, double weight, int score) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.score = score;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }


public void Grade(){
    System.out.println(name + "'s score is " + score );
}

}
