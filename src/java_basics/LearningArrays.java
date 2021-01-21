package java_basics;

public class LearningArrays {
    public static void main(String[] args) {
        // declare double variable in array with 100 "slots"
        double [] values = new double[100];
        // first position in array
        values[0] = 1000;
        // last position in array
        values[99] = 93432;
        System.out.println(values[0]);
        // String Array
        String [] words = new String [] {"My", "Name", "is"};
        System.out.println(words[2]);
        // re-assign words array
        words = new String[10];
        System.out.println(words[0]); // null (empty)
    }
}