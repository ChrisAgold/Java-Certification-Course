public class Bird extends Animal { // Bird is a child of Animal

    // Bird needs a constructor if being created outside the animal class
    public Bird(int age, String gender, int weightInlbs) {
        super(age, gender, weightInlbs);
    }

    // general method for moving
    public void move() {
        System.out.println("Fapping Wings...");
    }

    // Need to create interface since many birds do not fly and account for them
//     public void fly() {
//        System.out.println("Flying....");
//    }
}
