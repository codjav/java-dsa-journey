package Maths.Factor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        Factor2(n);
    }
    private static void Factor1(int n) {
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                System.out.println(i);
            }
        }
    }
    private static void Factor2(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                System.out.print(i + " ");
                if(n/i!=i) list.add(n/i);
            }
        }
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
