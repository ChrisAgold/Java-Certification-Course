package java_basics;

public class StringPractice {
    public static void main(String[] args) {

        String str = "ABCDEFG";
        // .substring method
        String extractedString = str.substring(0, 3); // includes 0 index and goes to/excludes index 3 // returns ABC
        System.out.println(extractedString);

        String a = "hello";
        String b = "there";

        // Compare strings in Java // use .equals
        if (a.equals("hello")) {
            // use this method not == for strings in Java
        }
        // .equalsIgnoreCase method // runs as long as spelled the same
        if (b.equalsIgnoreCase("TheRe")) {
            System.out.println("Printed there");
        }

        // find location of letter based on index
        System.out.println(a.charAt(3));
        // length of string .length
        System.out.println(a.length());

        // indexOf words
        String str1 = "Hello there yogi there";
        int c = str1.indexOf("there");
        System.out.println(c); // returns 6 where there begins
        int d = str1.indexOf("there", 7); // searches from index 7 for there
        System.out.println(d);

        // last indexOf
        int e  = str1.lastIndexOf("yogi"); // starts from right to left counting index
        System.out.println(e);

    }
}