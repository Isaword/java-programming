package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = "+ (!true));
        System.out.println("!false = "+ (!false));

        int age = 13;
        //check if age IS NOT more than 7. print "Need to sit in car seat"
        if (!(age > 7)) {
            System.out.println("Need to sit in car seat! Age: "+age);
        }else {
            System.out.println("Can sit normal seat. Age: "+age);
        }

        //if smoking is not allowed, print "Smoking is not allowed"
        boolean isSmokingAllowed=true;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here! EXIT!");
        }else {
            System.out.println("This are is for smoking");
        }

        //if its Not affordable, print "Item Not Affordable"
        boolean isAffordable=false;
        if (!isAffordable) {
            System.out.println("Item is Not Affordable");
        }

        String env= "qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong environment for QA testing");
        }

        String carModel= "Tesla";
        //if its not Tesla, print "Not Interested"
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you!");
        }

        String secretPassword= "abc123";
        String inputPassword= "abc321";
        //if inputPassword IS NOT equals inputPassword, print "Incorrect PAssword
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect Password");
        }

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect Password");
        }

        if (inputPassword.equals("abc123")) {
            System.out.println("Correct Password");
        }else {
            System.out.println("Incorrect Password");
        }
    }
}
