package java_basics;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Welcome to our zombie killer program!");
        System.out.println();
        String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
        String zombies[] = {"Close-range", "Mid-range", "Long-range"};

        System.out.println("Backpack items");
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);
        System.out.println();
        System.out.println("The zombies");
        System.out.println(zombies[0]);
        System.out.println(zombies[1]);
        System.out.println(zombies[2]);
        System.out.println();

        int numbers[] = {4, 90, 70, 123, 6, 54, 67};
        System.out.println(numbers[6]);
    }
}