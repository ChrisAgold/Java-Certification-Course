package practice.loops;

public class LoopsPractice {
    public static void main(String[] args) {

        // prints chris until it reaches 100
        int count = 0;
        while(count <= 100) {
            System.out.println("Chris " + count);
            count = count + 1;
            // will only print up to 29, breaks out of loop
            if(count == 30) {
                break;
            }
        }

        String str = "We have a large inventory of things in our warehouse falling in. " + "the categories: apparel and the slightly " + "more in demand category: makeup along with the category: furniture and ... .";
        printCategories(str);
    }
//     Exercise
//    extract all categories from the string argument
    public static void printCategories(String str) {

    }
}
