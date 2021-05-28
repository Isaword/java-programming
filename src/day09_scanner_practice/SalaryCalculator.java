package day09_scanner_practice;

public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate");
        double hourlyRate=85.0;
        double weeklyRate=hourlyRate*40.0;
        double monthlyPay=weeklyRate*52/12;
        double annualPay=weeklyRate*52;
        System.out.println("Weekly pay: "+weeklyRate);
        System.out.println("Monthly pay: "+monthlyPay);
        System.out.println("Annual pay: "+annualPay);
    }
}
