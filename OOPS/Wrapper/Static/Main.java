package OOPS.Wrapper.Static;

public class Main {
    public static void main(String[] args) {
        Human Javed = new Human("Javed", 21, true, 100);
        Human Imran = new Human("Imanr", 22, true, 100);
        Human.population +=10;
        System.out.println(Human.population);
        System.out.println(Human.population);

        // Accessing greeting through object obj-
        Main obj = new Main();
        obj.greeting();
    }

    // Fun is a static function we can't call non-static function inside it-
    static void fun() {
        System.out.println("hello! I, am static function");
    }

    // Greeting is a non-static function and can't be accessed from static funciton because it belongs to object So it can only be accessed through an object, But static function can be called inside a non-static function-
    void greeting() {
        fun();
        System.out.println("Hello! my name is md javed ali");
    }
}
