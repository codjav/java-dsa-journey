package Maths.Power;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int pow = 4;
        int res = Power(n, pow);
        System.out.println(res);
    }
    private static int Power(int base, int power) {
        int result = 1;
        while(power>0) {
            if((power&1)==1) {
                result*=base;
            }
            base *= base;
            power >>= 1;
        }
        return result;
    }
    private static int Even(int base, int power) {
        int result = 1;
        while(power>0) {
            if((power&1)==1) {
                result*=base;
                power-=1;
            }
            base*=base;
            power/=2;
        }
        return result;
    }
}
