package OOPS.Polymorphism;

public class Circle extends Shapes {

    // Parent Shapes and child circle both have function named area
    // But circles area method is overriding Shapes area method
    // So, child overrides parent and it is called dynamic/run time polymorphism
    void area() {
        System.out.println("Area is 3.14*r**2");
    }
}
