public class Earth {
    public static void main(String[] args) {
// Both tom and joe are separate objects
        Human tom;
        tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Asako";
        tom.speak();

        Human joe = new Human();
        joe.age = 36;
        joe.eyeColor = "Blue";
        joe.name = "Joe Grenslik";
        joe.heightInInches = 68;
        joe.speak();

    }

}
