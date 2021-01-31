public class Chicken extends Bird {
// Interfaces Notes, Chicken is child of Bird class, which is child of Animal

    // Constructor for Bird Class
    public Chicken(int age, String gender, int weightInlbs) {
        super(age, gender, weightInlbs);
    }

    // No longer needed due to Flyable.java//
    // Chicken inherits the fly method from the Bird class but cannot use it, since they can't fly, this method gets invoked instead of the parent method for fly
    //public void fly() {
    // Overriding the method = replacing the inheriting method
    //System.err.println("not able to fly....");
    //}
}