package Maths.MagicNum;

public interface Main {
    public static void main(String[] args) {
        int a = 50;
        int n = Pow(a);
        System.out.println(n);
    }
    private static int Pow(int a) {
        int res = 0;
        int pow = 1;
        while(a>0) {
            int i = a&1;
            pow *= 5;
            res += i*pow;
            a = a>>1;
        }
        return res;
    }
}
