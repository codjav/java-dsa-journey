package OOPS.Polymorphism;

public class Number {
    int sum(int a, int b) {
        return a+b;
    }
    int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        Number num = new Number();
        System.out.println(num.sum(10,20));
        System.out.println(num.sum(10,20, 30));
    }
}
