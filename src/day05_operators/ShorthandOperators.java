package day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int a=20;
        //assignment operator ==
        System.out.println(a);
        a=40;
        System.out.println(a);
        a=90;
        System.out.println(a);
        //addition assignment
        double balance=100;
        balance +=1000;// balance=100+1000;
        System.out.println("balance = " + balance);
        balance +=500;// 500 added current value balance=1100+500
        System.out.println("balance = " + balance);

        balance+=10000;// added 1000 current value
        System.out.println("balance = " + balance);

        balance-=1000;// decrease by current balance, balance=11600-1000
        System.out.println("balance = " + balance);

        balance-=5000;
        System.out.println("balance = " + balance);

        System.out.println("=====Multiplication Assigment=========");
        double salary=45000;
        salary *=2;// multiple by current value salary=45000*2
        System.out.println("salary = " + salary);

        //after couple your experience

        salary*=3;
        System.out.println("salary = " + salary);
        double eth=4;
        eth *=250;
        System.out.println("eth = " + eth);
        System.out.println("=====Division Assignment=========");
       eth /=2;
        System.out.println("eth = " + eth);

        System.out.println("salary = " + salary);
        salary /=2;// divided by 2 current value
        System.out.println("salary = " + salary);
        System.out.println("=====Remainder Assignment=========");
        int b= 39;
        b %=7; //b=39%7
        System.out.println("b = " + b);



    }
}
