package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den sp oon";

        System.out.println(word.toUpperCase().toLowerCase().length());

        //remove spaces, then print everything in uppercase
        System.out.println(word.replace(" ","").toUpperCase());

        // selenium.findElement(By.id("hi")).click();

        String city = "Chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        String capitalized= city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

        //.isEmpty().toUpperCase() does not work since it is boolean
    }

}
