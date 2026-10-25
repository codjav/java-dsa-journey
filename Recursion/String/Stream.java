package Recursion.String;

public class Stream {
    public static void main(String[] args) {
        String a = "abckdekakaad";
        Algo("", a);
        System.out.println(skip("appleappklayab"));
    }

    static void Algo(String a, String n) {
        if(n.isEmpty()) {
            System.out.println(a);
            return;
        }
        char ch = n.charAt(0);
        if(ch!='a') {
            a += ch;
        }
        Algo(a, n.substring(1));
    }
    
    static String skip(String a) {
        if(a.isEmpty()) {
            return "";
        }
        if(a.startsWith("apple")) {
            return ""+skip(a.substring(3));
        }else {
            return a.charAt(0) + skip(a.substring(1));
        }
    }
}
