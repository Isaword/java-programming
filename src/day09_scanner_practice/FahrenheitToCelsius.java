package day09_scanner_practice;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius");
        System.out.println("Enter Fahrenheit:");
        double fahrenheitValue=input.nextDouble();

        double celsius=(fahrenheitValue-32)*5/9;
        System.out.println(fahrenheitValue+ "F in C is: "+celsius+ " celsius");

    }
}
