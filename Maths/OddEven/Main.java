package Maths.OddEven;

public class Main {
    public static void main(String[] args) {
        int n = 190;
        System.out.println((Odd(n)) ? "Odd" : "Even");
    }
    private static boolean Odd(int n) {
        return (n&1) == 1;
    }
}
