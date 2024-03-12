package day19_ArrayIntro;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Gulcin";
        myGroup[4] = "Aseel";

        System.out.println(Arrays.toString(myGroup));//[Gulcin, null, null, null, Aseel]

        myGroup[2] = "Sumeye";
        myGroup[1] = "Abidullah";
        myGroup[3] = "Khashayar";

        System.out.println(Arrays.toString(myGroup));//[Gulcin, Abidullah, Sumeye, Khashayar, Aseel]

        myGroup[1] = "Kuzat";
        System.out.println(Arrays.toString(myGroup)); // array object is mutable, the elements, you can always change it if you want

//        myGroup[5] = "Muhtar";
//        System.out.println(Arrays.toString(myGroup));// ArrayIndexOutOfBoundsException
        // size of the array is always fixed
        System.out.println("===============================");

        for (int i = 0; i < myGroup.length; i++) {
            System.out.println(myGroup[i]);
        }// shortcut arrayName.fori

        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }// shortcut arrayName.forr

    }
}
