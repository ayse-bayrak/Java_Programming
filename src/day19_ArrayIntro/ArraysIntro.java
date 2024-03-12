package day19_ArrayIntro;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        System.out.println("------------------------------");
        int[] scores = new int[5]; // index: 0 ~ 4
        System.out.println(Arrays.toString(scores)); //[0, 0, 0, 0, 0]

        double[] scores1 = new double[5]; // index: 0 ~ 4
        System.out.println(Arrays.toString(scores1)); //[0.0, 0.0, 0.0, 0.0, 0.0]

        String[] scores2 = new String[5]; //index: 0 ~ 4
        System.out.println(Arrays.toString(scores2));//[null, null, null, null, null]
        //All non primitive data type default value is null

        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;

        //scores [6] = 90; //ArrayIndexOutOfBoundsException
        //scores[-1] = 65; //ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(scores));//[85, 75, 78, 88, 95]

//        scores = new int[10]; //0 ~ 9
//        //After this line new String[5] object is eligible to garbage collection and all those elements will be gone.
//
//        System.out.println(Arrays.toString(scores));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        System.out.println("================================== ");

        System.out.println(scores[2]);//78

        for (int i = 0; i < scores.length; i++) {//this length is public final int length, index number of scores array
            System.out.println(scores[i]);
        }

        System.out.println(scores[scores.length-1]); // 95   last element



    }
}
