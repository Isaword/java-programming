package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance=1200.44;
        System.out.println("balance = " + balance);
        
        double baklava=22.50;
        System.out.println("baklava = " + baklava);
        //decrease balance by baklava price
        balance=balance-baklava;
        System.out.println("balance after baklava = " + balance);

        double kenafa=44.45;
        System.out.println("kenafa = " + kenafa);
        balance=balance-kenafa;
        System.out.println("balance after kenafa = " + balance);
        //second kenafe is 50% off
        double kenafe2=kenafa/2;
        System.out.println("kenafe2 = " + kenafe2);
        balance=balance-kenafe2;
        System.out.println("balance after second kenafe = " + balance);
        
        double plov=7.99;
        System.out.println("plov = " + plov);
        balance=balance-plov;
        System.out.println("balance after plov= " + balance);
        
        double icedTea=3.00;
        System.out.println("icedTea = " + icedTea);
        // buy 4 iced teas and decrease balance
        balance=balance-(4*icedTea);
        System.out.println("new balance after 4 iced teas: "+balance);

        //return baklava
        balance=balance+baklava;
        System.out.println("balance after returning baklava is: $"+balance);
    }
}
