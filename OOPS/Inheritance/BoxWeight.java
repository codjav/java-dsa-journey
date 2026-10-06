package OOPS.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {
        super(other);

        this.weight = other.weight;
    }

    BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // Calling parent class constructor

        // Accessing element -
        System.out.println(super.l);  // Both works but if we have same element in parent and child we need to access parent class's element by using super
        System.out.println(this.l);

        this.weight = weight;
    }
}
