package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 0;
        do {
            System.out.println("Counter = "+counter);
            counter = counter+100;
            //counter += 5;
        } while (counter <= 1000);
    }
}