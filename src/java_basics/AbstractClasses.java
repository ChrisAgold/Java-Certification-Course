package java_basics;

// Create Abstract Class
abstract class Dog {
    // Method
    public void bark() {
        System.err.println("Bark");
    }
    // Creating abstract method
    public abstract void wag();
}

// Class Chihuahua is an extension of the abstract class Dog
class Chihuahua extends Dog {
    // Call abstract method
    public void wag() {
        System.err.println("Waging tail");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        // Chihuahua can use the methods from the abstract class now
        Chihuahua c = new Chihuahua();
        c.bark();
        c.wag();
    }
}
