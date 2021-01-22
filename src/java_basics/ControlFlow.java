package java_basics;

public class ControlFlow {
    public static void main(String[] args) {
        // IF ELSE
        boolean hungry = true;
        if (!hungry) {
            System.err.println("Im starving...");
        } else {
            System.err.println("I'm not hungry.");
        }

        int hungerRating = 5;
        if (!(hungerRating < 6)) {
            System.err.println("Not Hungry.");
        } else {
            System.err.println("I'm, starving...");
        }

        int favoriteTemp = 75;
        int currentTemp = 100;
        String opinion;
        // if statement within an if statement
        if (favoriteTemp == currentTemp) {
            if (currentTemp <= favoriteTemp - 30) {
                opinion = "It's pretty darn cold...";
            } else if (currentTemp < favoriteTemp - 20) {
                opinion = "It's kinda cold out...";
            } else if (currentTemp >= favoriteTemp + 10) {
                opinion = "It's hot out.";
            } else {
                opinion = "It's a beautiful day..";
            }
        } else {
            opinion = "unknown temp";
        }
        System.out.println(opinion);

        // SWITCH Statement
        int month = 4;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            default:
                monthString = "Unknown Month";
                break;
        }
        System.out.println(monthString);
    }
}
