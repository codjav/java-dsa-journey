package Recursion.Easy.Question;

public class Palin {
    public static void main(String[] args) {
        int n = 1235321;

        // ! Method 1 -
        // int pow = pow(n)/10;
        // int a = palin(n, pow);
        // System.out.println((a==n) ?"True" : "False");

        // ! Method 2 -
        int end = power(n);
        System.out.println(pal(n, end));

    }

    //! Method 1 -
    private static int palin(int n, int pow) {
        if(n/10==0) return n;
        return n%10*pow + palin(n/10, pow/10);
    }
    private static int pow(int n) {
        if(n==0) return 1;
        return 10*pow(n/10);
    }


    //! Method 2 -
    private static boolean pal(int n, int s) {
        if(s<10) return true;
        int first = n/s;
        int last = n%10;
        if(first != last) return false;
        return pal((n%s)/10, s/100);
    }
    private static int power(int n) {
        if(n<=10) return 1;
        return 10*(power(n/10));

        // int s = 1;
        // while (n >= 10) {
        //     s *= 10;
        //     n /= 10;
        // }
        // return s;
    }
}
