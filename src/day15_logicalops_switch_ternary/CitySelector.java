package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Boston";
        //Moscow or Tampa
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to "+city);
        }else {
            System.out.println("Not considering - "+ city);
        }

        String teacher = "Nadir";
        //Saim OR Murodil --> it is a java class with Saim
        //otherwise -- >  Soft skill class with Nadir


        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class with "+teacher);
        }else {
            System.out.println("Soft skill class with "+teacher);
        }

        //1-teacher Saim or Murodil --> It is java class
        //2- teacher Nadir --> Soft skill class with
        //any other teacher --> Some class with Gurhan/Akbar

        teacher="Akbar";

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("Java class with "+teacher);
        }else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with "+teacher);
        }else {
            System.out.println("Some class with "+teacher);
        }

        //company - "Google" OR salary >= 100k -> accept offer
        String company="Chase";
        Double salary= 176_000.0;

        if (company.equals("Google") || salary >= 100_000.0) {
            System.out.println("Accepting offer from "+company);
        }else {
            System.out.println("Rececting offer from "+company);
        }
    }
}
