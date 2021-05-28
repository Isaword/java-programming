package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your current speed:");
        int currentSpeed= scan.nextInt();
        int sl1=55;
        int overTheLimit=currentSpeed-sl1;

        System.out.println("You are driving "+overTheLimit+" miles over the limit!");

    }
}
