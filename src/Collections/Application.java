package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("cat");
        animals.add("Dog");
        animals.add("Bird");

        // Loop though ArrayList
//        for (int i=0;i < animals.size();i++) {
//            System.out.println(animals.get(i));
//        }
//
//        // for each loop
//        for(String value : animals) {
//            System.out.println(value);
//        }

        List<Vehicle> vehicles = new LinkedList<Vehicle>();
        Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 1200, false);

        vehicles.add(new Vehicle("Honda", "accord", 1200, false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 2500, true));

        for (Vehicle value : vehicles) {
            System.out.println(value);
        }
        printElements(vehicles);
        printElements(animals);
        
    }
    public static void printElements(List someList) {
        for(int i=0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }
    }
}