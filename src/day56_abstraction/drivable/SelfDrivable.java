package day56_abstraction.drivable;

public interface SelfDrivable {
    void autoPiloting();
    //void selfPark(); this causes errors in sub-classes because they must override abstract method
    public default void selfPark() { //default keyword prevent errors in sub-classes
        System.out.println("Performing self park steps");
    }
}
