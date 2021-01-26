public class Recursion {
    public static void main(String[] args) {
        // sayHi(5);
        countBackwards(14);
    }

    // EX 1
//    public static void sayHi(int n) { // int n says how many times we want it to sayHi
//        if (n == 0) {
//            System.out.println("Done");
//        } else {
//            System.out.println("hi");
//            n--; // to get to base case
//            sayHi(n);
//        }
//    }

    // EX 2 Counts Backwards
    public static void countBackwards(int n) {
        if(n == 0) {
            System.out.println("Done");
        } else {
            System.out.println(n);
            n--;
            countBackwards(n);
        }
    }
}
