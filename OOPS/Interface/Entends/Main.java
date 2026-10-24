package OOPS.Interface.Entends;

public class Main implements B{
    public void greet() {
        System.out.println("Hello, Salam");
    }
    public void fun() {
        System.out.println("Wanna have some football match.");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.greet();
        obj.fun();
    }
}
