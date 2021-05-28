package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }

    public static void seatInCar () {
        System.out.println("1. Open the door and seat in driver seat");
        //System.out.println("2. Start the car");
        //System.out.println("3. Push the gas");
        //System.out.println("4. Follow traffic rules");
    }

    public static void pressGasPedal() {
        System.out.println("4. Hold steering wheel with 2 hands and press gas pedal");
    }

    public static void startTheCar() {
        System.out.println("2. Insert key to ignition and turn clockwise");
    }
    public static void shiftToDrive () {
        System.out.println("3. Press break pedal and shift to 'D'");
    }
}
