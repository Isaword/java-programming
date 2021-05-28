package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i+=2) {
            System.out.print(i + " ");
            //i += 2;
        }
        System.out.println();
        for (int i = 2; i <= 10; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Even Numbers 0-100: ");
        for (int n = 1; n <= 100; n++) {
            if(n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println("\nODD NUMBERS 0-100: ");
        for (int k = 0; k <= 100; k++) {
            if(k % 2 != 0) {
                System.out.print(k + " ");
            }
        }
    }
}
