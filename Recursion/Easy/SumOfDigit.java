package Recursion.Easy.Question;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Sum(n));
        System.out.println(Product(n));
    }
    private static int Sum(int n) {
        if(n<=0) return 0;
        return n%10+Sum(n/10);
    }
    private static int Product(int n) {
        if(n<=0) return 1;
        return n%10*Product(n/10);
    }
}
