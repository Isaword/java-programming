package day04_variables_intro;

public class AmazonItem {
    public static void main(String[] args){
        String description="HIC wooden spoon";
        int ratingsCount=181;
        double price=5.99;
        String seller="amazon.com";
        System.out.println(description);
        boolean prime=true;
        System.out.println(prime);

        System.out.println("-----PRODUCT INFO-----");
        System.out.println(description);
        System.out.print("*****");
        System.out.println(ratingsCount);
        System.out.println(price);
    }
}
