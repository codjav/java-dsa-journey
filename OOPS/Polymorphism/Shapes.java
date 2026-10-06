package OOPS.Polymorphism;

public class Shapes {
    //! Late Binding - Because its configured at run time
    void area() {
        System.out.println("I am in shapes class.");
    }

    //! Early binding - Its final so java know which area function to call before run time 
    // final void area() {
    //     System.out.println("I am in shapes class.");
    // }
}
