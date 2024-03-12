package day12_customMethods;

public class TestCallingMethodOtherClass {
    public static void main(String[] args) {
        int number = 300;
        CustomMethodWithParameter.oddOrEven(number);

        String firstName = "Vasyl",
                lastName = "Dobrianski";

        CustomMethodPractice.initialPerson(firstName,lastName);
    }
}
