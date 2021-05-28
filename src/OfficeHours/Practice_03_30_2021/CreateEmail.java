package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class CreateEmail {
    /*
    [Creating an email]
Ask user to enter two strings. Both of these strings should be at least 6 character long. If they
are shorter than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and
combine them with the last three characters of the second string. At the end of your combined
string add “@cybertek.com” and print the final string as your created email. The final email
should be in all lowercase.
input:
JamesBond
Secret
output:
jameret@cybertek.com
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1= input.nextLine();
        String word2= input.nextLine();
        String email="";

        if (word1.length() >= 6 && word2.length() >= 6){

            email=word1.substring(0,4);
            email += word2.substring(word2.length()-3); //Secret
            email +="@cybertek.com";
            System.out.println(email);

        }else {
            System.out.println("Invalid data");
        }
    }
}
