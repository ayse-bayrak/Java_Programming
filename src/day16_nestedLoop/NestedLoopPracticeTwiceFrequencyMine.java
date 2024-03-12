package day16_nestedLoop;

public class NestedLoopPracticeTwiceFrequencyMine {
    public static void main(String[] args) {

        String str = "aaabbcccddeeeeff";
        int count = 0;
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            count=0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i)== str.charAt(j)) {
                    count += 1;
                }
            }

            if (   count==2 && ! (  result.contains(str.charAt(i)+ "")  )   ) {
                result += str.charAt(i);
            }

        }

        System.out.println(result);

            //            for (int j = 0; j < twice.length() ; j++) {
//
//                str.charAt(i)
//            }





    }
}
/*
write a program that can return characters that appeared twice from a string
        	Ex:
        		str = "aaabbcccccddeeeefff"


		     output:
		     	bdf
 */