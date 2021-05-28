package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.startsWith("Int")); //false-first letter upper case

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name = "Maria";
        if (name.endsWith("a")) {
            System.out.println("Maybe a female name");
        }

        /**
         * Mr. -> Man
         * Dr. -> Doctor
         * Mrs.-> Married woman
         * Ms. -> Single woman
         * Sr. -> Senior
         */

        String firstName = "Sr. Nadir";
        if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        }else if(firstName.startsWith("Mr.")) {
            System.out.println("Man");
        }else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        }else if(firstName.startsWith("Ms.")) {
            System.out.println("Single woman");
        }else if(firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        }else {
            System.out.println("Normal name");
        }

        String website = "www.isa.org";
        if(website.endsWith("org")) {
            System.out.println("Organization");
        }else if(website.endsWith("com")) {
            System.out.println("commercial");
        }else if(website.endsWith("edu")) {
            System.out.println("Educational");
        }else if(website.endsWith("gov")) {
            System.out.println("Government");
        }
    }
}
