package java_basics;

// Creat class for LearningMethods folder
public class MyUtils {
    // create new method
    public static void printSomeJunk(String argument) { // takes in String argument, must assign argument
        System.out.println("String passed " + argument);
    }

    public static int printSomeJunk(int argument) {
//        System.out.println("Integer passed in:" + argument);
        int answer = argument - 10;
        return answer;
    }

    public static void sum2Numbers(int firstArg, int secondArg) {
        System.out.println(firstArg + secondArg);
    }

    public static int add10(int someArgument) { // replace void with int since it is the return type, we want the result to be an integer
        int result = someArgument + 10;
        return result; // when using return must make result as variable
    }
}
