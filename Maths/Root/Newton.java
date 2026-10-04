package Maths.Root;

public class Newton {
    public static void main(String[] args) {
        double n = 40;
        double ans = Seive(n);
        System.out.println(ans);
    }
    private static double Seive(double n) {
        double x = n;
        double ans;

        while(true) {
            ans = 0.5*(x+(n/x));
            if(Math.abs(ans-x)<0.5) break;
            x = ans;
        }

        return ans;
    }
}
