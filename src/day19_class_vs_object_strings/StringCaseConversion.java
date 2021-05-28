package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word="Kemal";
        String sentence= "Java IS FUN!";

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        String wordLowerCase = word.toLowerCase();
        System.out.println("wordLowerCase = " + wordLowerCase);

        word = word.toLowerCase();
        System.out.println("word = " + word);

        word = word.toUpperCase();
        System.out.println("word = " + word);

        String company= "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - "+ company.toUpperCase());
        System.out.println("java".toUpperCase());
        
        //change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
