package Contests.Codeforces.Round1134;

import java.util.Scanner;
import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            int[] arr = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            Arrays.sort(arr);
            if((arr[2]-arr[1]==1) && (arr[1]-arr[0]==1)) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
