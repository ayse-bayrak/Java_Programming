package day13_customMethodContinue;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        //int total = sum(20, 40); //error because sum is a void method, does nit return any data
    int total = addition(10, 20); // custom method returns data, because it is return method

        int t = square(10);
        System.out.println(t);//100
        System.out.println(square(8));

        System.out.println(cube(5));
        int r = cube(5);
        System.out.println(t);

    }

/*
    public static void sum(int n1, int n2){
        int result = n1 + n2;
    }

 */

    public static int addition(int n1,int n2)   {
        int result = n1 + n2 ;
        return result;

    }

    public static int square(int num){
        int square = num*num;
        return square;// this method is returning data, once you have the data you have so many options
    }
        // you can creat the method at any place within the class outside the other method.
    public static int cube(int num) {
        int cube = square(num) * num ;
        return cube;
    }

}
