package OOPS.Abstract;

public class Child extends Parent{
    Child(int age) {
        super(age);
    }

    @Override 
    void career(String name) {
        System.out.println("I am going to be a "+ name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I will marry Aalima of age lesser than me.");
    }

    void daughter(String name) {
        System.out.println("I will name my daughter "+name);
    }
}
