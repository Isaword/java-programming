package OfficeHours.Practice_04_13_2021;

public class Gradebook {
    /*
    Gradebook ( Similar to MaxMinPrice from class)Declare three arrays:
1.String array which will hold names for the students (give values)
2.Int array which has the score of the student got in the quiz (give values)
3.Char array which will have some letter grade based on the score (empty)
4.Output the gradebook at the end with all the information Grade scale:
Above 85: A
Above 75: B
Above 65: C
Other: D
Example:Names = [“Mike”, “Joe”, “Ana”, “Ali”, “Joanna”]
Scores = [80, 54, 100, 66, 94]
Grades=[‘B’, ‘D’, ‘A’, ‘C’, ‘A’] -> Need to find and store these based on score
Output:
Mike |80 | B
Joe |54| D
Ana | 100 | A
Ali |66 | C
Joanna | 94 | A
     */
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for(int i=0; i < scores.length; i++){
            int eachScore = scores[i];

            if(eachScore >= 85) {
                grades[i] = 'A';
            } else if(eachScore >= 75){
                grades[i] = 'B';
            } else if(eachScore >= 65){
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
        }

        System.out.println("GRADEBOOK");

        for(int i=0; i < names.length; i++) {
            System.out.println(names[i] + " | " + scores[i] + " | " + grades[i]);
        }
    }
}
