package day05_operators;

public class RelationalOperator {
    public static void main(String[] args) {
        int a= 1000;
        int b= 200;
        System.out.println("=====greater than========");
        System.out.println(a>b); //it will give us ===>true
         a=200; b =1000;

        System.out.println(a>b);// false

        boolean aIsGreater = a>b ;
        System.out.println(aIsGreater);// false
        System.out.println("=====greater than or equal========");
        int score =75;
        boolean passed = score>=60;
        System.out.println(passed);
        System.out.println("============");
        int age=21;
        boolean eligibleToBuyAlcohol = age>21;
        System.out.println(eligibleToBuyAlcohol);
        boolean eligibleToVote = age >=18;

        System.out.println(eligibleToVote);
        System.out.println("==============================");
        System.out.println(100>100);//false
        System.out.println(100>=100);//true
        System.out.println(100>=180);//false
        System.out.println("=========less than operator==============");

        score = 48;
        boolean failed = score < 60;
        System.out.println(failed);
        System.out.println("==============");
        System.out.println(100 < 2000); // true
        System.out.println(100 < 20);//false

        System.out.println("=========less than or equal operator==============");
        System.out.println(95 <= 100);//true
        System.out.println(95 <= 95);// true
        System.out.println(10<=100);//true
        System.out.println(10<=5);//false

        System.out.println("===============characters===========");
        System.out.println('a'>'b');// characters have corresponding numbers
        //                  65 > 66



    }
}
