package day16_nestedLoop.warmupTask;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "java JAVA jAvA JAvajava java java";
        sentence = sentence.toLowerCase();
        String word = "Java";
        word = word.toLowerCase();

        int count = 0;

        while (sentence.contains(word)) {
            count++;
            sentence = sentence.replaceFirst(word, "");

        }
        System.out.println(count);
    }
}
/*
Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
 */