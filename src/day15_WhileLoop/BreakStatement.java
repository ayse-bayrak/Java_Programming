package day15_WhileLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {

            System.out.println(i);

            if(i==5) {// if i's value reaches 5
                break;// exits the loop
            }
        }

        System.out.println("=================================");
        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.println(i);

        }
    }
}
