package OfficeHours.Practice_03_22_2021;

public class OperatorExample {
    public static void main(String[] args) {
        int a=3,  b=2;
        long c= (a-- +b) * 2 / 3 % 2;
        //      (3   +2) * 2 / 3 % 2
        //         (5)   * 2 / 3 % 2
        //             10    / 3 % 2
        //                  3    % 2
        //                      1
    }
}
