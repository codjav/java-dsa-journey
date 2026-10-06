package Recursion.Easy.Question;

public class Count {
    public static void main(String[] args) {
        int n = 80480;
        System.out.println(count(n));
    }
    private static int count(int n) {
        int co = 0;
        if(n==0) return 0;
        if(n%10==0) co++;
        co += count(n/10);
        return co;
    }
}
