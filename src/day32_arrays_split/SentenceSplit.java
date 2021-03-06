package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word = "+ words[0]);
        System.out.println("2nd word = "+ words[1]);
        System.out.println("3rd word = "+ words[2]);
        //System.out.println("4th word = "+ words[3]); //out of bound
        for (String w : words){
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] chunk = googleResult.split(" ");
        System.out.println("2nd chunk = "+chunk[1]);
        System.out.println("Second = "+ chunk[3].replace("(", ""));
        System.out.println("Second = "+ chunk[3].substring(1));

    }
}
