package day32_arrays_split;
import java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {
            //           0     1     2       3
        String words = "java,python,selenium,html";
        String[] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("wordsArray.length = " + wordsArray.length);

        for(String each : wordsArray) {
            System.out.println(each);
        }

        String sentence = "today I am coding java arrays";
        String[] distinctWords=  sentence.split(" ");
        System.out.println(Arrays.toString(distinctWords));
        System.out.println("Number of words in sentence = " + distinctWords.length);
        System.out.println("first word = " + distinctWords[0]);
        System.out.println("first word = " + sentence.split(" ")[0]);

        for (String each: distinctWords) {
            System.out.println(each);
        }

    }
}
