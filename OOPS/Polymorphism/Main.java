package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle1 = new Circle();
        Triangle triangle1 = new Triangle();
        Square square1 = new Square();
        Shapes square = new Square();

        shape.area();
        circle1.area();
        square.area();
    }
}
