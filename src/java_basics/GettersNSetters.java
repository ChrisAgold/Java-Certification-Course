package java_basics;

public class GettersNSetters {
    String name;
    int age;

    public static void main(String[] args) {
        GettersNSetters a = new GettersNSetters();
        a.age = 34;
        a.name = "Pablo";
        System.out.println(a.name);
        System.out.println(a.age);
        a.sayHappyBDay("Jonas");
        a.Age("34");
    }

    public static void sayHappyBDay(String name) {
        System.out.println("Happy birthday " + name);
    }

    public static void Age(String age) {
        System.out.println("Your age is " + age);
    }
}