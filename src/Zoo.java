public class Zoo {
    // Notes before Abstract Classes //
//    public static void main(String[] args) {
//        Animal animal1 = new Animal(12, "M", 23);
//        animal1.eat();

    // Bird bird1 = new Bird(3, "F", 10);
    // bird1.eat(); // can access all methods

    // Interface makes this no longer usable //
    // Chicken chick1 = new Chicken(1, "M", 7);
    // chick1.fly();

    // Abstract Classes Notes //
//    public static void main(String[] args) {
//        Sparrow sparrow1 = new Sparrow(1, "M", 4);
    // sparrow1.move();
//        Fish fish1 = new Fish(1, "M", 2);
    // fish1.move();
//        moveAnimal(fish1);
//        moveAnimal(sparrow1);
//    }
//    public static void moveAnimal(Animal animal) {
//        animal.move();
//    }
//}

    public static void main(String[] args) {
        Flyable flyingBird1 = new Sparrow(1, "m", 4);
    }
}