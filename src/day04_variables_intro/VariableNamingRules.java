package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
        //int static=22; ERROR, static is reserved by java
        int static2=22;
        int _static=22;
        int $tatic=44;
        int staticVar=234;

        int salary$=55;
        //int 1stMonthSalary=3000; ERROR, cannot start with number
        int $=66;
        int _=7;
        System.out.println($);
        System.out.println(_);
        //int number-of-friends=400; ERROR
        int numberOfFriends=400;
        int number_of_friends=400;



    }
}
