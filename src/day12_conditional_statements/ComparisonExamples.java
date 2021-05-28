package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed=45;
        int speedLimit= 55;

        System.out.println(currentSpeed>speedLimit);
        System.out.println(speedLimit<currentSpeed);
        System.out.println(speedLimit==currentSpeed);

        boolean isSpeeding= currentSpeed>speedLimit;

        System.out.println("Ar you speeding? -"+isSpeeding);
        System.out.println("speedLimit = " + speedLimit);
        System.out.println("currentSpeed = " + currentSpeed);

        currentSpeed += 20;

        System.out.println(currentSpeed>speedLimit);
        System.out.println(speedLimit<currentSpeed);
        System.out.println(speedLimit==currentSpeed);

        double accountBalance=250.25;
        double itemPrice= 200.99;
        System.out.println("Can I afford? -" + (accountBalance>=itemPrice));

        boolean canAfford= accountBalance>=itemPrice;
        System.out.println("can afford= "+canAfford);

        //decrease balance by itemPrice. using shorthand operator
        accountBalance=accountBalance-itemPrice;
        accountBalance-=itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - "+isBroke);


}

    }

