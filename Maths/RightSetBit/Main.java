package Maths.RightSetBit;

public class Main {
    public static void main(String[] args) {
        String s = "1010101010100";
        System.out.println(RightSet(s));
    }
    private static int RightSet(String s) {
        int n = s.length()-1;

        for(int i=n; i>=0; i--) {
            int num = s.charAt(i)-'0';
            if((num^0) == 1) return i;
        }

        return -1;
    }
}
