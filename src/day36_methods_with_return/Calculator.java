package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5,20));
        System.out.println(subtract(5, 20));
        System.out.println(multiply(5,20));
        System.out.println(division(5,20));
        double sum = add(1,3);
        System.out.println("sum = " + sum);
        System.out.println("100 + 100 = " + add(100,100));
        System.out.println(division(1,0));
    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double subtract(double num1, double num2){
        double subtraction = num1 - num2;
        return subtraction;
    }

    public static double multiply(double num1, double num2){
        double multiplication = num1 * num2;
        return multiplication;
    }

    public static double division(double num1 , double num2){
        double division = num1 / num2;
        return division;
    }
}
