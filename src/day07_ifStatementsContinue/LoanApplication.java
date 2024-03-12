package day07_ifStatementsContinue;
/*
1. Create a class named LoanApplication.
two variables named salary and createdScore are declared and given,
write a program that can check if the person is eligible to apply for a loan
            Note: In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700
 */
public class LoanApplication {
    public static void main(String[] args) {
int salary = 45000;
int creditScore = 700;
String result = "--";

if (salary >= 45000 && creditScore >= 70 ) {
    //System.out.println(" You are eligible for the loan");
    result = " You are eligible for the loan";
}
else {
    //System.out.println( "You are not eligible for the loan");
    result = "You are not eligible for the loan";
}
        System.out.println(result);

    }
}
