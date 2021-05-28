package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location="New York City";
        Double salary=176_000.0;
        Boolean isRemote= true;
        Boolean hasBenefit= true;

        if (location.equals("New York City") && salary >= 176000.0 && isRemote && hasBenefit) {
            System.out.println("Sure, I will accept this offer");
        }else {
            System.out.println("Lets consider another offer or negotiate");
        }
    }
}
