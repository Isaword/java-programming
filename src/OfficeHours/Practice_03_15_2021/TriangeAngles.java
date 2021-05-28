package OfficeHours.Practice_03_15_2021;

public class TriangeAngles {
    public static void main(String[] args) {
        /*[Triangle - If statement, operators]
        A triangle is valid if the sum of all the three angles is equal to 180 degrees.
         Write a program that declares three integers as angles
        and check whether the triangle is valid or not. Print "Valid triangle" or "Not a valid triangle".

         */

        int angleOne = 101;
        int angleTwo = 30;
        int angleThree = 50;
        int sum = angleOne + angleTwo + angleThree;
        if (sum == 180) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a valid triangle");
        }

        if ((angleOne + angleTwo + angleThree) == 180) {
        }

        boolean check = (angleOne + angleTwo + angleThree) == 180;
        if (check) {
            System.out.println("Valid triangele");
        } else {
            System.out.println("Not Valid Triangle");
        }
    }
}
