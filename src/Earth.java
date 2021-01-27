public class Earth {
    public static void main(String[] args) {
// Both tom and joe are separate objects
//        Human tom;
//        tom = new Human();
//        tom.age = 5;
//        tom.eyeColor = "brown";
//        tom.heightInInches = 72;
//        tom.name = "Tom Asako";
//        tom.speak();
//
//        Human joe = new Human();
//        joe.age = 36;
//        joe.eyeColor = "Blue";
//        joe.name = "Joe Grenslik";
//        joe.heightInInches = 68;
//        joe.speak();

        Human human1 = new Human("Tom", 25, 76, "green");
        Human human2 = new Human("Ken", 26, 80, "brown");
        Human human3 = new Human("Kim", 23, 66, "blue");
        human1.speak();
        human2.speak();
        human3.speak();

//        Zoo tiger = new Zoo("Tiger", 8, 200, "Orange");
//        Zoo lion = new Zoo("lion", 7,220,"Yellow");
//        tiger.animal();
    }



}
