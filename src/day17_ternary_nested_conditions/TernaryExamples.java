package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 100;
        String result= (score > 60) ? "pass" : "fail";
        System.out.println(result);

        String quality= "bad";
        int x = (quality.equals("good")) ? 100 : 0;
        //System.out.println(x); OR
        System.out.println(quality.equals("good") ? 100 : 0);

        score=99;
        char grade= (score > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);


    }
}
