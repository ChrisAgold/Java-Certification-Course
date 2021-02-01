package practice.loops;

public class ForLoops {
    public static void main(String[] args) {
        String name = "ksdklfjsljfsljf";

        // loop to iterate over all the letters
//        for (int i = 0; i <= name.length() - 1; i++) {
//            System.out.println("char " + name.charAt(i));
//        }

        // Exercise // Print the characters in the string backwards
//        for (int j = name.length() -1; j >= 0; j--) {
//            System.out.println("char " + name.charAt(j));
//        }

        // Exercise // Print all numbers that are even between 0 & 100
//        for (int k = 0; k <= 100; k++) {
//            if (k % 2 == 0)
//                System.out.println(k);
//        }
        // OR
        for (int k = 0; k <= 100; k+=2) {
            System.out.println(k);
        }
    }
}