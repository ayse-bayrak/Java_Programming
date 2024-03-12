package day28_encapsulation.encapsulation;

public class Student {

    private String name;
    private int age;

    public void setName(String name) { //encapsulation setter WRITE
// name have to have only letters, no digit character
        boolean hasDigit = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }

        if (hasDigit) {
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getName() {  //encapsulation getter READ

        if (name == null) {
            System.out.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }


    public void setAge(int age) {// WRITE ONLY- only purpose of this setter function is just to update the value.

        if (age < 1 || age > 100) {// if age is invalid
            System.err.println("Invalid age: " + age);
            // return; // exiting the method
            System.exit(1); // entire program gets terminated
        }
        this.age = age;
    }

    public int getAge() {//  READ ONLY- only purpose read the data

        if (age == 0) {
            System.out.println("Age has not been set");
            System.exit(1);// there is something went wrong
        }
        return age;
    }
}
