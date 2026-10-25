package Recursion.String;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        // perm("", "abc");

        ArrayList<String> list = perma("", "abcd");
        System.out.println(list);
    }

    static void perm(String p, String un) {
        if(un.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = un.charAt(0);

        for(int i=0; i<=p.length(); i++) {
            perm(p.substring(0, i)+ch+p.substring(i, p.length()), un.substring(1));
        }
    }

    static ArrayList<String> perma(String p, String un) {
        if(un.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = un.charAt(0);

        for(int i=0; i<=p.length(); i++) {
            ArrayList<String> ls = perma(p.substring(0, i)+ch+p.substring(i, p.length()),un.substring(1));
            for(int j=0; j<ls.size(); j++) {
                list.add(ls.get(j));
            }
        }

        return list;
    }
}
