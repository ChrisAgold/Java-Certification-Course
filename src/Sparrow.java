public class Sparrow extends Bird implements Flyable{

// Constructor for Bird Class
    public Sparrow(int age, String gender, int weightInlbs) {
        super(age, gender, weightInlbs);
    }

    public void fly() {
        System.err.println("Sparrow flying");
    }
}