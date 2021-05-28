package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(0);
        displayValue(3);
        int count = 55;
        displayValue(count);

        greetByName("Kemal");
        greetByName("Fatih");
        String isim = "Suleymen";
        greetByName(isim);
    }

    public static void displayValue (int num) {
        System.out.println("Display value is: "+num);
    }

    /**
     * method name: greetByName
     * @param /input String Name
     * It prints "Hello {Name}, how are you today?
     */
    public static void greetByName(String name) {
        System.out.println("Hello "+name+ ", how are you today?");
    }
}
