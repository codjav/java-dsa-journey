package OOPS.Abstract;

public class Main {
    public static void main(String[] args) {
        Child children = new Child(30);
    
        children.daughter("Beti");
        children.partner("Sahiba", 23);
        children.career("Engineer");
        Parent.hello();

        // We can't create object of Abstract parent class but can create with refrence of Child class
        Parent daughter = new Child(20);
    }
}
