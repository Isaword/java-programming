package day07_aritmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10+5-3);
        System.out.println(10-5+3);
        System.out.println(10-(5+3));

        System.out.println(2*3/3);
        System.out.println(20/2*2);
        //System.out.println(10/0); --Cannot divide by zero
        System.out.println(0/10);

        System.out.println(2+5*3);
        System.out.println((2+5)*3);

        System.out.println(10/3);
        System.out.println(5/2); //When you divide two 2 whole numbers, the result will always be whole numbers. Java will delete the decimals.

        System.out.println(10.0/3.0);
        System.out.println(5.0/2.0);
    }
}
