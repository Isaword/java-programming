package OfficeHours.Practice_04_19_2021;

public class MethodClassTest {
    public static void main(String[] args) {
        MethodClass.methodOne();
        System.out.println(MethodClass.methodTwo());
        String s = MethodClass.methodTwo();
        System.out.println(s);
        MethodClass.methodTwo().trim().length();
        System.out.println(MethodClass.methodThree("words"));
        String s2 = "words";
        System.out.println(MethodClass.methodThree(s2));
    }
}
