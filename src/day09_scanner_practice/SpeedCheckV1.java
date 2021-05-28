package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        int sl1=55;
        int currentSpeed=40;
        int overTheLimit=currentSpeed-sl1;

        System.out.println("You are driving "+overTheLimit+" miles over the limit!");
    }
}
