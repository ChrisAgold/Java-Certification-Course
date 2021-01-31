package practice.loops;

public class LoopsPractice {
    public static void main(String[] args) {

        // prints chris until it reaches 100
//        int count = 0;
//        while(count <= 100) {
//            System.out.println("Chris " + count);
//            count = count + 1;
//            // will only print up to 29, breaks out of loop
//            if(count == 30) {
//                break;
//            }
//        }

        String str = "We have a large inventory of things in our warehouse falling in. " + "the category:apparel and the slightly " + "more in demand category:makeup along with the category:furniture and ... .";
        printCategories(str);
    }

    //     Exercise
//    extract all categories from the string argument
    public static void printCategories(String string) {
        int i = 0;
        while (true) {
            int found = string.indexOf("category:", i); // find index of first occurrence of category
            if(found == -1) break;
            int start = found + 9; // start of the actual category, first letter of word after category
            int end = string.indexOf(" ", start);
            System.out.println(string.substring(start, end));
            i = end+1;
        }
    }
}
