package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;

        while (seconds <= 117) {
            System.out.println("Watchin Youtube \uD83D\uDC08 video: seconds = " + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching \uD83D\uDC08 video, lets start another one");
    }
}
