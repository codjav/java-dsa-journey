package Recursion.Easy.Question;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));
    }
    private static int Fact(int n) {
        if(n==1) return 1;
        return n*Fact(n-1);
    }
}
