package OfficeHours.Practice_03_08_2021;
import java.util.Scanner;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter you length; ");
        double length=input.nextDouble();
        System.out.println("Enter your width: ");
        double width=input.nextDouble();

        //hard coded values
        //double length=5;
        //double width=3;

        double perimeter= 2*(length+width);
        double area= length*width;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


        }
    }
