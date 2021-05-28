package day09_scanner_practice;

import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("##### miles to KM Converter####:");
        System.out.println("Enter miles: ");
        //double miles=10.0;
        double miles=scan.nextDouble();
        double KM=miles*1.609;
        System.out.println(miles+" miles in KM is: "+KM);
        }
    }

