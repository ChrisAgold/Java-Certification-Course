public class Bird extends Animal { // Bird is a child of Animal

    // Bird needs a constructor if being created outside the animal class
    public Bird(int age, String gender, int weightInlbs) {
        super(age, gender, weightInlbs);
    }

    public void fly() {
        System.out.println("Flying....");
    }
}
