package Contests.Codeforces.Round1137;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            System.out.println(minOperations(a, n));
        }

        sc.close();
    }

    private static long minOperations(long[] a, int n) {
        long ops = 0;
        int maxSteps = 4 * n + 10;

        while (maxSteps-- > 0) {
            int negIdx = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] < 0) {
                    negIdx = i;
                    break;
                }
            }

            if (negIdx == -1) {
                return ops;
            }

            if (negIdx == 0) {

                if (n >= 2 && a[0] + a[1] >= 0 && a[1] <= 0) {
                    applyOp(a, n, 1);
                    ops++;
                } else {
                    return -1;
                }
            } else {

                applyOp(a, n, negIdx);
                ops++;
            }
        }

        for (long val : a) {
            if (val < 0) return -1;
        }
        return ops;
    }


    private static void applyOp(long[] a, int n, int idx) {
        long v = a[idx];
        a[idx - 1] += v;
        if (idx + 1 < n) {
            a[idx + 1] += v;
        }
        a[idx] = -v;
    }
}