package day07_aritmetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args) {
        System.out.println("java"+5+3);
        System.out.println("java"+(5+3));
        System.out.println(5+3+"java");
        System.out.println(5+(3+"java"));

        System.out.println("hello"+1+2+3);
        System.out.println("hello"+(1+2+3));

        String str1="hello", str2="friends";
        System.out.println(str1+" "+str2);

        int num1=7, num2=8;
        System.out.println(num1+num2);
        System.out.println(num1+" "+num2);
        System.out.println(num1+""+num2);

    }
}
