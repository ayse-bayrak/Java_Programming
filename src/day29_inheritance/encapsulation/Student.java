package day29_inheritance.encapsulation;

public class Student {
    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }
    public void setName(String name) {
        if (name == null) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // age can not be less than 5 or greater than 90
    public void setAge(int age) {

        if (age < 0 ) {
            System.err.println("Age can not be negative");
            System.exit(1);
        }

        if (age <5 || age > 90) {
            throw new RuntimeException("Invalid age, Age can not be less than 5 or greater than 90: " + age);
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    //gender should not be set to any chanarcter other than: 'M' and 'F'

    public void setGender(char gender) {

        if (!(gender =='M' || gender == 'F')) {
            throw new RuntimeException("gender should not be set to any chanarcter other than: 'M' and 'F' ");
        }
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    //grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'
    public void setGrade(char grade) {
        if (!(grade =='A' || grade == 'B'|| grade =='C' || grade == 'D'||grade =='F')) {
            throw new RuntimeException("grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'");
        }
        this.grade = grade;
    }
    public char getGrade() {
        return grade;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public String getSchoolName () {
        return schoolName;
    }



    public void study() {
        System.out.println(name + " is studying at " + schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade+
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fields (at least encapsulate two fields manually)

                    requirements:
                        1. age can not be less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()
 */