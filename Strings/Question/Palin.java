package Strings.Question;

public class Palin {
    public static void main(String[] args) {
        String str = "9jaaj9";
        boolean a = Pal(str);
        System.out.println(a);
    }
    private static boolean Pal(String str) {
        str = str.toLowerCase();
        int s = 0;
        int e = str.length()-1;
        while(s<e) {
            if((char)str.charAt(s) != (char)str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
