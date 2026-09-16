package OOPS.Wrapper;

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.name);
        System.out.println(obj);
    }
}

class A{
    final int num = 10;
    final String name = "Javed";
}