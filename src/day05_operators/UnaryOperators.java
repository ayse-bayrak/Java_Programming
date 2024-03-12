package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {
        //pre increment/decrement means BEFORE the operand
        System.out.println("=========pre increment/decrement==========");
        int x=10;//x is operand and ++ operator
        System.out.println(++x);//in the memory change value's x ===>11
        System.out.println(x);//11

        int y=100;
        System.out.println(--y);//99
        System.out.println(y);//99
        System.out.println("=========post increment/decrement===========");
        //post increment/decrement OPERATORS ARE PLACED AFTER THE OPERAND
        int a=50;
        System.out.println(a++);//50
        System.out.println(a);//51

        int b=25;
        System.out.println(b--);//25
        System.out.println(b);//24

        System.out.println("============");
        int n=30;
        int m=n++;//m=30 n=31
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        
        int z=60;
        int q=z--;//60
        System.out.println("q = " + q);
        System.out.println("z = " + z);
        
    }
}
