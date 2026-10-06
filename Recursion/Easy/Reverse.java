package Recursion.Easy.Question;

public class Reverse {
    public static void main(String[] args) {
        int n = 12345;
        String a = Rev(n);
        int b = Integer.parseInt(a);
        System.out.println(b);

        Rever(n);
        System.out.println(sum);
    }
    private static String Rev(int n) {
        if(n/10==0) return n+"";
        String a = "" + n%10+Rev(n/10);
        return a;
    }
    static int sum = 0;
    private static void Rever(int n) {
        if(n==0) return;
        sum = sum*10 + n%10;
        Rever(n/10);
    }
}
