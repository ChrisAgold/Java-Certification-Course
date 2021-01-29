public class Fish extends Animal {

    public Fish(int age, String gender, int weightInlbs) {
        super(age, gender, weightInlbs);
    }

    // adds due to abstract class
    public void move() {
        System.out.println("fish is swimming...");
    }

    public void swim() {
        System.out.println("Swimming.....");
    }
}