package day19_class_vs_object_strings;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPAssword = "Abc123";

        String userName = "CYBERTEK";
        String password = "abc1234";

        if (userName.equalsIgnoreCase(expUserName) && password.equals(expPAssword)) {
            System.out.println("Pass - user successfully logged in " + Instant.now());
        } else {
            if (!userName.equalsIgnoreCase(expUserName)) {
                System.out.println("Fail - Incorrect User Name!");
            } else {
                System.out.println("Fail - Password is incorrect!");
            }
        }
    }
}