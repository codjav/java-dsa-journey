package OOPS.Wrapper.Static;

public class Main {
    public static void main(String[] args) {
        Human javed = new Human(22, "javed", 40000, false);
        Human imran = new Human(23, "imran", 40000, false);

        System.out.println(javed.name);
        System.out.println(Human.population);
        System.out.println(javed.population);
        Human.message();

        // greeting();
    }

    //* */ Static -
    // Belongs to Class, Can be directly accessed, Can't access non-static inside static


    //* */ Non-Static -
    // Belongs to Object, Needs to initialize objects before accessing, Can access static inside non-static

    static void fun() {
        Main obj = new Main();
        obj.greeting(); // We can access it because it is accessed using its obj object

        greeting(); // We can't use it because it requires a instance/Object
    }
    // Something which is not static belongs to a object -
    void greeting() {
        System.out.println("Hello!");
    }
    void some() {
        greeting(); //Can access non-static inside non-static without creating a object for it.
        fun(); //Can access static inside non static.
    }
}
