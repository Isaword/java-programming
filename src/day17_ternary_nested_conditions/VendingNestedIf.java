package day17_ternary_nested_conditions;

public class VendingNestedIf {
    /*
    selection = "drink" orr can be "snack"
drink = "tea" , "coke"
snack = "chips" , "candy"

when selection is "drink":
    "drink option is selected"

    when drink is "tea":
        "tea is selected"
    when drink is "coke":
        "coke is selected"
when selection is "snack"
    "snack option is selected"

    when snack is "chips":
        "chips item is selected"
    when snack is "candy":
        "candy item is selected"
*/
    public static void main(String[] args) {
        String selection = "snack";
        String drink = "coke";
        String snack = "candy";

        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drink.equals("tea")) {
                System.out.println("tea is selected");
            } else {
                System.out.println("coke is selected");
            }

        } else if (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if (snack.equals("chips")) {
                System.out.println("chips item is selected");
            } else {
                System.out.println("candy item is selected");
            }
        }

    }
}


