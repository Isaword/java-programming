package OfficeHours.Practice_03_22_2021;

public class ArmyQualification {
    public static void main(String[] args) {
        String citizenship="USA";  // next()
        boolean resident=true;    // nextBoolean()
        int age= 18;               // netInt()
        boolean hadDiploma=true;   // nextBoolean()

        if (citizenship.equalsIgnoreCase("USA") || resident) {
            if (age >= 18 && age <= 35) {
                if(hadDiploma) {
                    System.out.println("You are qualified for the army");
                }else {
                    System.out.println("You must have a high school diploma");
                }
            }else {
                System.out.println("Your age must be between 18 and 35");
            }

        }else {
            System.out.println("You must be a US citizen or resident");
        }
    }
}
