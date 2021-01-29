package java_basics;
// Constructors make an Object for you
public class Shirt {
    // properties of a shirt
    public static String color;
    public static char size;

    // Create Constructors
    Shirt() {}
    // Create Constructor with parameters
    Shirt(String newColor, char newSize){
        color = newColor;
        size = newSize;
    }

    // Create constructor in the class
//    Shirt() {
//        System.out.println("inside constructor");
//    }

    // Methods of what you can do with a shirt
    public static void putOn() {
        System.out.println("Shirt is on.");
    }

    public static void takeOff() {
        System.out.println("Shirt is off.");
    }

    // Making Method
    public static void setColor(String newColor) {
        color = newColor;
    }
    public static void setSize(char newSize) {
        size = newSize;
    }
}
