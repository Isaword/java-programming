package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result =  "result count:12345";
        System.out.println(result.substring(13));
        System.out.println(result.substring(13,18));

        //find the index of :
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));

        //now we can combine them into one statement
        System.out.println(result.substring(result.indexOf(":")+1));

        String today = "i learned [java] today";
        /**
         * find index of [
         * find index ]
         * provide them as start, end index for substring
         * to print java
         */
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start+1, end));
        System.out.println(today.substring(today.indexOf("[")+1, today.indexOf("]")));
    }
}
