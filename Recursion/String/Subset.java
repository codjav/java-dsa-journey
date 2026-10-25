package Recursion.String;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        String a = "abc";
        // ArrayList<String> list = Subsequenceq(a, "");
        // for(int i=0; i<list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        // By Iteration
        ArrayList<ArrayList<String>> lists = Subsequencei(a);
        for(int i=0; i<lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
    static void Subsequence(String a, String b) {
        if(a.isEmpty()) {
            System.out.println(b);
            return;
        }
        char c = a.charAt(0);
        Subsequence(a.substring(1), b);
        Subsequence(a.substring(1), b+c);
    }


    static ArrayList<String> Subsequenceq(String a, String b) {
        if(a.isEmpty()) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(b);
            return arr;
        }
        char c = a.charAt(0);
        ArrayList<String> brr = Subsequenceq(a.substring(1), b);
        ArrayList<String> crr = Subsequenceq(a.substring(1), b+c);

        brr.addAll(crr);

        return brr;
    }

    static ArrayList<ArrayList<String>> Subsequencei(String b) {
        ArrayList<ArrayList<String>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(char c:b.toCharArray()) {
            int len=outer.size();
            for(int i=0; i<len; i++) {
                ArrayList<String> internal = new ArrayList<>(outer.get(i));
                internal.add(""+c);
                outer.add(internal);
            }
        }

        return outer;
    }
}
