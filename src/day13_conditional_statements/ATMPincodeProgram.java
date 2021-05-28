package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("******Welcome to TD Bank ATM*********");
        int secretPincode=2233;
        int inputPincode=2233;

        if (secretPincode == inputPincode) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, deposit, check balance");
        } else {
            System.out.println("Incorrect Pincode! "+inputPincode);
            System.out.println("Please try again!");
        }

        System.out.println("Thank you for using TD Bank ATM!");
    }
}
