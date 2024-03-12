package day19_ArrayIntro;

import java.util.Arrays;

public class ArrayUtilityClass {
    public static void main(String[] args) {
        int [] scores = {10, 20, 30, 40, 50};

        System.out.println(scores);
        System.out.println(Arrays.toString(scores));

      int [] scores2 = Arrays.copyOfRange(scores,1, 3 );

        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(scores2));


    }
}
