package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {

        double bonus = 0;
        double salesAmount = 500;

        if (salesAmount <= 1000) {
            System.out.println("Good job! you qualified for bonus!");
            bonus = 50;

        } else {
            System.out.println("Great! You qualified for full bonus!");
            bonus = 100;
        }
        System.out.println("bonus amount= $" + bonus);
    }
}
