package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        /*
        method name:
    checkEligible
input/parameter:
    int creditScore

if creditScore is 700 or more
    you are eligible for leasing this car
otherwise
    Sorry, you are not eligible for leasing this car
         */
        checkEligible(729);
        checkEligible(815);
        checkEligible(400);
        //System.out.println(checkEligible(711));  error-cannot print void method
        System.out.println(getCreditScore());
        System.out.println("Credit score = "+getCreditScore());
        int score = getCreditScore();
        System.out.println("Score = "+score);
    }

    public static void checkEligible(int creditScore) {
        if (creditScore >= 700 ) {
            System.out.println("you are eligible for leasing this car");
        }else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
    }

    public static int getCreditScore() {
        return 800;
    }
}
