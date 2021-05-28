package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";

        if (todaysClass.equals("java")) {
            System.out.println("java is fun");
            System.out.println("java is fun again");
        } else
            System.out.println("it is not java. it is " + todaysClass);


        int score=5;

        if (score==1)
            System.out.println("lowest score 1");
        else if (score==2)
            System.out.println("score is low");
        else if(score==3)
            System.out.println("score is middle" +
                    "");
        System.out.println("score is highest");
    }
}
