package day18_conditions_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int num= 0;

        if (num >0) {
            System.out.println("Number "+num+" is positive");
        }else if(num<0) {
            System.out.println("Number "+num+ " is negative");
        }else { //else if (num == 0)
            System.out.println("Number is zero");
        }
    }
}
