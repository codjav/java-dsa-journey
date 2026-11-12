package Contests.Codeforces.Round1134;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int count = 0;
            boolean red = true;
            for(int i=0; i<n; i++) {
                char ch = s.charAt(i);
                if(ch=='R' && !red) {
                    red = !red;
                    count++;
                }else if(ch=='B' && red) {
                    red = !red;
                    count++;
                }
                red = !red;
            }
            System.out.println(count);
            t--;
        }
        sc.close();
    }
}
