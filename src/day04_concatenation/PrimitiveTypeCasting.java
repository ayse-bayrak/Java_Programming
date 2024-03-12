package day04_concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        // ------implicit casting------
        byte a=25;
        //short b= (short)a;// short it is not needed
        short b= a;


        //----explicit casting------
        int x=100;
        byte y=(byte)x;

        float z=20.8f;
        short q= (short) z;
        System.out.println("q = " + q);//20

        double n1=2.5;
        byte n2= (byte) n1;
        System.out.println("n2 = " + n2);//2

        int o=200;
        byte u= (byte) o;//explicit casting

        System.out.println("u = " + u);


    }
}
