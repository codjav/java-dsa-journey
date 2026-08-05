import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t>0) {
            System.out.println(min(sc));
            t--;
        }
    }
    static int min(Scanner sc) {
        int N = sc.nextInt();
        int C = sc.nextInt();
        
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        int min = 1;

        int s = 1;
        int e = arr[N-1]-arr[0];
        while(s<=e) {
            int m = s+(e-s)/2;
            if(canPlace(arr, m, C)) {
                min = m;
                s = m+1;
            }else {
                e = m-1;
            }
        }

        return min;
    }
    static boolean canPlace(int[] arr, int m, int C) {
        int cow = 1;
        int last = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(cow>=C) return true;
            if(arr[i]-last >= m) {
                last = arr[i];
                cow++;
            }
        }
        if(cow>=C) {
            return true;
        }
        return false;
    }
}
