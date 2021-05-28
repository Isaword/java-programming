package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String [] args){
        String carModel="Honda";
        String driverName="Isa Word";
        String licenceNum="HKA1119";
        short speed= 180;
        boolean isAutomatic=true;
        char licenceClass='C';

        System.out.println("Car model:\t "+carModel);
        System.out.println(carModel+ " is a car model");
        System.out.println(driverName+ " is driving a car");
        System.out.println(driverName+ " is driving "+carModel);
        System.out.println(speed);
        System.out.println("Current speed is "+speed+ " mph");
        System.out.println("Is it automatic? " +isAutomatic);
        System.out.println(licenceClass+" "+isAutomatic);
        System.out.println(10+5);

        String firstName="Isa";
        String lastName="Word";
        String fullN="Isa+Word";
        System.out.println(fullN);
    }
}
