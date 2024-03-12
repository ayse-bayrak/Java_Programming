package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        //&& logical AND if both expression are true
        double salary = 60000;
        int creditScore = 500;
        int age = 25;
        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;// must be true both expression
        System.out.println(eligibleForLoan);

        System.out.println("===================================");
        age = 35;
        String country="Japan";
        boolean eligibleToVote = age>=18 && country=="USA";

        System.out.println(eligibleToVote);
        System.out.println("==========LOGICAL OR || =================");
        String answer= "maybe";
        boolean validAnswer = answer=="yes" || answer=="no";

        char grade ='B';
        boolean passedTheExam = grade=='A'|| grade == 'B' || grade =='C'|| grade =='D';
        System.out.println(passedTheExam);//true
        System.out.println("==========LOGICAL not ! =================");
        System.out.println(!true);//false

        String a = "yes";
       boolean yes= a=="yes"; //true
        boolean no = !yes; // false
        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("===================");
        int score= 65;

        boolean passed = score >=60;// true
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("======================");
        System.out.println(  true == ! false && false == !true && true != !true );
                        //            true           true            true



    }
}
