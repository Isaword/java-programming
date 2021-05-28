package OfficeHours.Practice_03_15_2021;

public class OperatorAnalyze2 {
    public static void main(String[] args) {
        /*Analyze the following without intellij. Calculate the output step by step

        int a = 200;
        int b = -a++ + - --a * a-- % 2 + a;

        What is the value of a and b?

         */

        int a = 200; // a = 200
        int b = -a++ + - --a * a-- % 2 + a;
        //     -200  + - 200 * 200 % 2 + 199 ???
    }
}
