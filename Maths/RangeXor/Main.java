package Maths.RangeXor;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 8;
        int ans = XOR(b) ^ XOR(a);
        System.out.println(ans);
    }
    private static int XOR(int b) {
        int bp = b%4;
        if(bp==0) return b;
        else if(bp==1) return 1;
        else if(bp==2) return b+1;
        return 0;
    }
}
