package OOPS.Lambda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0; i<6; i++) {
            lst.add(i+3);
        }

        lst.forEach((item)->System.out.println(item*3));
    }

    Operation sum = (a, b) -> a+b;
    Operation product = (a, b) -> a*b;
    Operation div = (a, b) -> a/b;

    int sum(int a, int b) {
        return a+b;
    }
}


interface Operation {

    int operation(int a, int b);
}
