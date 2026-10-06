package OOPS.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    static void greeting() {
        System.out.println("Hello Javed i am in static box greeting!");
    }

    public Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    public Box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    // cuboid 
    public Box(double l, double h, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    // Copy constructor
    public Box(Box b) {
        this.h = b.h;
        this.l = b.l;
        this.w = b.w;
    }

    public void information() {
        System.out.println("Running the box.");
    }
}
