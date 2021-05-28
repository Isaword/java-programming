package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;

        while (count >= 0) {
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("Finished the count");

        /**
         * Read each message 1 by 1 until you have 0 unread SMS
         */

        int unreadSMS = 10;

        while (unreadSMS > 0) {
            System.out.println("unreadSMS = " + unreadSMS);
            unreadSMS--;
        }
        System.out.println("No unread message left");
    }
}
