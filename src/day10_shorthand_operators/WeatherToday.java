package day10_shorthand_operators;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args) {
        Scanner isa=new Scanner(System.in);
        System.out.println("How is the weather today?");
        //String weather="rainy and cold"
        String weather=isa.nextLine();
        System.out.println("The weather is "+weather+ " today");

    }
}
