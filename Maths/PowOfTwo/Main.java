package Maths.PowOfTwo;

public class Main {
    public static void main(String[] args) {
        int n = 88;
        boolean ans = (n & n-1) == 0;
        System.out.println(ans);
    }
}
