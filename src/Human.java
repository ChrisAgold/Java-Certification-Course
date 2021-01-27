// Class & Object
public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;


    // Constructor Method
    public Human(String name, int age, int heightInInches, String eyeColor) {
        super();
        this.age = age;
        this.eyeColor = eyeColor;
        this.heightInInches = heightInInches;
        this.name = name;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("My eye color is " + eyeColor);
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void walk() {
        System.out.println("walking...");
    }

    public void work() {
        System.out.println("working...");
    }
}

// Exercise Zoo Class
class Zoo {
    String name;
    int age;
    int weightInPounds;
    String color;

    // Constructor Method
    public Zoo(String name, int age, int weightInPounds, String color) {
        super();
        this.age = age;
        this.color = color;
        this.weightInPounds = weightInPounds;
        this.name = name;
    }
    public void animal() {
        System.out.println("Hello, I am a " + name);
        System.out.println("I weight " + weightInPounds);
        System.out.println("My color is " + color);
    }

}

