package OfficeHours;

public class Stage1Calculator {

    public static void main(String[] args) {
        double numOne=5.0;
        double numTwo=10.0;

        double addition=numOne+numTwo;
        double subtraction=numOne-numTwo;
        double multiply=numOne*numTwo;
        double division=numOne/numTwo;
        double remain=numOne%numTwo;

        System.out.println("Calculation for "+numOne+" & "+numTwo);
        System.out.println(numOne+"+"+numTwo+"="+addition);
        System.out.println(numOne+" - "+numTwo+" = "+subtraction);
        System.out.println(numOne+"*"+numTwo+"=" +multiply);
        System.out.println(numOne+"/"+numTwo+"="+division);
        System.out.println(numOne+ " % "+ numTwo+ " = "+ remain);

    }
}
