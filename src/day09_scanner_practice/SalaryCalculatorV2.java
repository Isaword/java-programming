package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyRate=scan.nextDouble();
        double weeklyRate=hourlyRate*40.0;
        double monthlyPay=weeklyRate*52/12;
        double annualPay=weeklyRate*52;
        System.out.println("Weekly pay: "+weeklyRate);
        System.out.println("Monthly pay: "+monthlyPay);
        System.out.println("Annual pay: "+annualPay);
    }
}
