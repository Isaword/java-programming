package day56_abstraction.drivable;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.start();
        model3.hi();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(25);
        model3.stop();
        model3.bye();

        Plane plane = new Plane();
        plane.start();
        plane.hi();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(250);
        plane.land();
        plane.stop();
        plane.bye();

        //Polymorphism:
        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Plane();

        Transportation tp1 = new Tesla();
        Transportation tp2 = new Tesla();
    }
}
