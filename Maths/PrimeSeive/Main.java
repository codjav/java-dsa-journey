package Maths.PrimeSeive;

public class Main {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n+1];
        System.out.println(arr[1]);
        Seive(n, arr);
    }
    private static void Seive(int n, boolean[] arr) {
        for(int i=2; i*i<=n; i++) {
            if(!arr[i]) {
                for(int j=i*2; j<=n; j+=i) {
                    arr[j]=true;
                }
            }
        }
        for(int i=2; i<n; i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
        }
    }
}
