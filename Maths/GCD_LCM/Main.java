package Maths.GCD_LCM;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        System.out.println(LCM(a, b));
    }
    private static int GCD(int a, int b) {
        if(a==0) return b;
        return GCD(b%a, a);
    }
    private static int LCM(int a, int b) {
        return a*b/GCD(a,b);
    }
}
