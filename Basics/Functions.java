package Basics;

// import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // System.out.println("enter no. 1");
        // int a = sc.nextInt();
        // System.out.println("enter n0. 2");
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println("sum = "+ sum);

        int n = sc.nextInt();
        // System.out.println(isPrime(n));
        System.out.println(isArmstrong(n));

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        sc.close();

        // change(a, b);
        // System.out.println(a +" "+ b);

        // fun(1,3,4,5,6,7,78,876,34);
    }

    // static void change(int a, int b) {
    //     int tem = a;
    //     a = b;
    //     b = tem;
    // }

    // static void fun(int ...a) {
    //     System.out.println(Arrays.toString(a));
    // }

    // static boolean isPrime(int n) {
    //     if (n<1) {
    //         return false;
    //     }
    //     int c = 2;
    //     while (c*c <= n) {
    //         if (n%c == 0) {
    //             return false;
    //         }
    //         c++;
    //     }
    //     if(c*c > n) {
    //         return true;
    //     }
    //     return false;
    // }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while(n>0) {
            int rem = n%10;
            n = n/10;
            sum += rem*rem*rem;
        }
        return sum == original; 
    }
}
