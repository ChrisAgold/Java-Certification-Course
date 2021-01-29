public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal(12, "M", 23);
        animal1.eat();

        Bird bird1 = new Bird(3, "F", 10);
        bird1.eat(); // can access all methods

        // Interface makes this no longer usable //
        // Chicken chick1 = new Chicken(1, "M", 7);
        // chick1.fly();
    }
}