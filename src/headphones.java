public class headphones {
    // connected to Objectoriented
    String charge = "Micro usb";
    String[] controls = {"power", "volume", "skip", "play/pause"};
    String color = "Red/black";

    static boolean power = false;
    static int volume = 0;

    // Power
    public static void powerOn() {
        power = true;
    }
    public static void powerOff() {
        power = false;
    }

    // Volume
    public static void volumep() {
        volume++;
    }
    public static void volumeDown() {
        volume--;
    }



}
