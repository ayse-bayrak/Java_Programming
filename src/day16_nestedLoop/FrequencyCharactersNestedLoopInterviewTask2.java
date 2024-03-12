package day16_nestedLoop;

public class FrequencyCharactersNestedLoopInterviewTask2 {
    public static void main(String[] args) {
        String str = "AAABBCCCCDDDDD";

        String result = "";  // "bdf"

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character of str
            int count = 0;
            for (int i = 0; i < str.length(); i++) { // responsible for comparing ch to each character of str
                // and return the frequency of ch
                if(str.charAt(i) == ch){
                    count++;
                }
            }

            if(!result.contains(""+ch)){
                result += ch;
                result+=count;
            }



        }


        System.out.println(result);
    }
}
/*
2. FrequencyOfCharacters:
			"AAABBCCCCDDDDD"

			output:
				A3B2C4D5
 */