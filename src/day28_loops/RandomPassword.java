package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";

        Random random = new Random();
        String password="";


        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(71); //random num 0-70
            System.out.print(source.charAt(index));

            password += source.charAt(index);

            //System.out.println(random.nextInt(source.length()));
        }
        System.out.println();
        System.out.println("\nYour Password: " + password);
    }
}
