package day54_abstraction;

/**
 * we add abstract keyword to a class to make it abstract class.
 * we cannot create object of Student cass- meaning:
 * Student student = new Student(); will show ERROR
 * What can we do with this Student class? We can extend this class by sub-classes
 * Student class will be PArent class for all other types of student related classes
 */

public abstract class Student {

    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }

    /**
     * we can add abstract methods into abstract class
     * abstract methods is created using abstract keyword
     * and does not have the implementation/method body
     */

    public abstract void attendClass();
}


