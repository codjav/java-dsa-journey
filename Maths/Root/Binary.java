package Maths.Root;

public class Binary {
    public static void main(String[] args) {
        int n = 10;
        int p = 4;
        double ans = Root(n, p);
        System.out.printf("%.3f",ans);
    }
    private static double Root(int n, int p) {
        int s = 0;
        int e = n;
        double ans = 0.0;
        while(s<=e) {
            int mid = s+(e-s)/2;
            if(mid*mid==n) return mid;
            if(mid*mid<n){
                s = mid+1;
            }else {
                e = mid-1;
            }
            ans = e;
        }

        double pres = 0.1;
        for(int i=0; i<p; i++) {
            while(ans*ans<n) {
                ans += pres;
            }
            ans -= pres;
            pres /= 10;
        }

        return ans;
    }
}
