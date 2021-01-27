public class Objectoriented {

    // Describe a pen
    String type = "gel";
    String color = "blue";
    int point = 10;

    // Add some actions for the pen
    static boolean clicked = false;

    public static void click() {
        clicked = true;
    }

    public static void unclick() {
        clicked = false;
    }
}

