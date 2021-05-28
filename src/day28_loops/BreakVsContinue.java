package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        // break statement
        for (int n=1; n<=5; n++){
            System.out.print(n);
            if (n == 3) {
                break; // LOOPS and SWITCH ONLY
            }

        }
        System.out.println();
        // continue : 135
        for (int i=1; i<=5; i++){
            if (i == 2 || i == 4){
                continue; //go to next iteration. skip the code below. LOOPS ONLY
            }
            System.out.print(i);
        }
    }
}
