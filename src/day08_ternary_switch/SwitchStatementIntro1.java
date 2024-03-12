package day08_ternary_switch;

public class SwitchStatementIntro1 {
    public static void main(String[] args) {
        char grade = 'U';
        String result ="";
        switch (grade ) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
            result = "Great Job";
            break;
            default:
                System.out.println("invalid");
            case 'C':
            result = "Good";
            break;
            case 'D':
            result = "Passed";
            break;
            case 'F':
            result = "Failed";
            break;

        }
        System.out.println(result);
    }
}
