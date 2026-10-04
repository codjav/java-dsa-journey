package Maths.CountSet;

public class Main {
    public static void main(String[] args) {
        int n = 142904289;
        System.out.println(Integer.toBinaryString(n));
        int count = Count(n);
        System.out.println(count);
    }
    private static int Count(int n) {
        int count = 0;
        while(n>0) {
            count++;
            // n -= (n&(-n));
            n = (n&(n-1));
        }
        return count;
    }
}
