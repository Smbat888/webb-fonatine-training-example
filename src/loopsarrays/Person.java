package loopsarrays;

public class Person {

    int age;
    double weight;
    String name;

    @Override
    public String toString() {
        return name + ": age: " + age;
    }

    void sayHello() {
        System.out.println("Hello from " + name);
    }

    public double getWeight() {
        System.out.println("weight of " + name);
        return weight;
    }

    int sum(int a, int b) {
        return a + b;
    }




}
