package day19_ArrayIntro;

import java.util.Arrays;

public class ArrayUtilityClass {
    public static void main(String[] args) {
        int [] scores = {10, 20, 30, 40, 50};

        System.out.println(scores);//[I@6bdf28bb
        System.out.println(Arrays.toString(scores));//[10, 20, 30, 40, 50]

      int [] scores2 = Arrays.copyOfRange(scores,1, 3 );
      int [] scores3 = Arrays.copyOfRange(scores,1, 4 );

        System.out.println(Arrays.toString(scores));//[10, 20, 30, 40, 50]
        System.out.println(Arrays.toString(scores2));//[20, 30]
        System.out.println(Arrays.toString(scores3));//[20, 30, 40]


    }
}
