package day14_forLoop;

public class OverloadingTheMainMethod {

    public static void main(String[] args) {

        System.out.println("A");

        /*
        only real main method get executed
        when removed the [] sign execute custom main method,
        main(25); // B
        main(2.05); //C
        main(true); //D

         */

    }


    //public static void main(int args)
    public static void main(int[] args){

        System.out.println("B");

    }

    public static void main(double[] args) {

        System.out.println("C");

    }

    public static void main(boolean[] args) {

        System.out.println("D");

    }

}
