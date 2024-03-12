package day15_WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            if(i==4) {// 4 is skipped
                continue;
            }
            System.out.println(i);

        }

        System.out.println("----------------------------");

        for (int i = 10; i < 21 ; i++) {

            if(i%2==0) {// if i is even
                continue;// then skips the current iteration
            }
            System.out.println(i);// 11 13 15 17 19
        }

        System.out.println("----------------------------");

        for (char i = 'A'; i <=  'G'; i++) {

            if (i=='B' || i == 'E'){
                continue;}
            System.out.println(i);

        }

        System.out.println("----------------------------");

        for (int i = 0; i < 10; i++)
            // without curly braces one statement executed
            System.out.println("Hello World");//ten times
            System.out.println("Hello Cydeo");// one times

        System.out.println("----------------------------------");
        // find the sum of all the even number between 50 ~ 100
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 50; i <101 ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum1 += i;
            }
        }

        System.out.println(sum1);
        System.out.println();

        for (int i = 50; i < 101; i++) {

            if (i%2 != 0) continue;;
            System.out.print(i + " ");
            sum2 += i;
        }

        System.out.println(sum2);
        System.out.println();

        for (int i = 50; i <101 ; i+=2) {
            System.out.print(i + " ");
            sum3 += i;
        }

        System.out.println(sum3);

    }
}
