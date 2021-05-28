package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 4444;
        int pinCode = 1111;

        int expLast4SSN = 8888;
        int expPinCode = 2222;

        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication FAILED!");
            if (last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN number is incorrect");
                }
            if (pinCode != expPinCode) {
                System.out.println("Pincode is wrong!");
            }
        }
    }
}
