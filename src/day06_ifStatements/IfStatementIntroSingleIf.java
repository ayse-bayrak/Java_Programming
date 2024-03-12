package day06_ifStatements;

public class IfStatementIntroSingleIf {
    public static void main(String[] args) {
        int number=-100;
        boolean isPositive= number > 0;
        boolean isNegative= number < 0;
        boolean isZero= number == 0;
        if (isPositive) {
            System.out.println(number + " is positive ");
        }

        if (isNegative) {
            System.out.println(number + " is negative ");
        }
        if (isZero) {
            System.out.println(number + " is Zero ");
        }
        System.out.println("======================");
        number=0;

        if (number>0){
            System.out.println(number + " is pozitive number");
        }
        if (number<0) {
            System.out.println(number + " is negative number");
        }

        if (number == 0){
            System.out.println(number + " is zero");
        }


    }
}
