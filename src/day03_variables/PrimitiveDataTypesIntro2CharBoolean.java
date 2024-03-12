package day03_variables;

public class PrimitiveDataTypesIntro2CharBoolean {
    public static void main(String[] args) {
        //DataType variableName=Data;
        char a='@';//designed single code
        char b='1';
        //char x='ab';compile error because must single character
        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------");

        // in Java every single character has a number, a corresponding number
        //first 128 characters are on the ASCII table

        char ch1='A';
        System.out.println(ch1);
        char ch2=65;
        System.out.println(ch2);
        //output: A

        System.out.println("---------------------------");

        char ch3=30000;
        System.out.println(ch3);

        //char ch4=-100; not allowed less than zero

        int sum= 'A'+ 'B';
             //   65 + 66=131
        System.out.println(sum);//131

        //boolean r1=123;
        //boolean r2=2.5;
        //boolean r3="Java";

        boolean r4=true;
        boolean r5=false;
        boolean r6=100>10; // true
        boolean r7=0<-1;// false
        System.out.println(r6);
        System.out.println(r7);
    }

}
