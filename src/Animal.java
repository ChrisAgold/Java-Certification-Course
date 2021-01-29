public abstract class Animal {
    int age;
    String gender;
    int weightInlabs;

    public Animal(int age, String gender, int weightInlbs) {
        this.age = age;
        this.gender = gender;
        this.weightInlabs = weightInlbs;
    }

    // Make abstract class
    public abstract void move();


    public void eat() {
        System.out.println("Eating...");
    }
    public void sleep() {
        System.out.println("Sleeping....");
    }




}
