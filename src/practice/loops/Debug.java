package practice.loops;

public class Debug {
    public static void main(String[] args) {

//        int counter = 0;
//        for(int i = 0; i <= 100; i++) {
//            System.out.println(i);
//            int temp = counter + 1;
//            counter = temp;
//        }

        // nested loops
        int counter = 0;
        for(int idx = 0; idx < 100; idx++) {
            for (int j = 0; j < 10; j+=2) {
                System.out.println("the value of idx was " + idx + " ------------ " + j);
                counter++;
            }
        }
        System.out.println("COUNTER: " + counter);
    }
}