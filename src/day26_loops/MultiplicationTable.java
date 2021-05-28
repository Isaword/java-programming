package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 15;
        /**
         * if number less than 1 or more than 10
         * print "ERROR: invalid input"
         * exit main method: return;
         */
        if (number < 1 || number > 10) {
            System.out.println("ERROR: invalid input");
            return; // exit main method, stop the program
        }
        for (int n = 1; n <= 10; n++) {
            System.out.println(number + " x  " + n + " = "+ (number*n));
        }
    }
}
