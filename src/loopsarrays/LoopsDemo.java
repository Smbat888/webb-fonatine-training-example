package loopsarrays;


public class LoopsDemo {


    public static void main(String[] args) {

        Person a = new Person();
        a.name = "Ashot";
        a.age = 44;
        Person b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = null;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
