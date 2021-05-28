package day20_string_manipulaation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o")); //true

        //if company contains space, print "company name with multiple words"
        // else "single word company name"
        if (company.contains(" ")) {
            System.out.println("company name with multiple words");
        }else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        //check if " | " is in etsyTitle
        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass- title check passed");
        }else {
            System.out.println("FAil- title check failed");
        }

        String firstName = "ahmed";
        // check if firstName contains both "a" and "e" at the same time.
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("both a && e are present");
        }else {
            System.out.println("a || e not present");
        }

        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        }else {
            System.out.println("a or i is not present");
        }

        String email = "abcgmail.com";
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Valid email");
        }else {
            System.out.println("Invalid email");
        }

        if (email.toLowerCase().contains("d")) {
            System.out.println("d is present");
        }
    }
}
