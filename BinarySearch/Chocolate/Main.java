package BinarySearch.Chocolate;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(countMax(3, 2, arr));
    }
    public static int countMax(int N, int K, int[] arr) {
        int s = arr[0];
        int e = 0;
        for(int i:arr) {
            e += i;
            s = Math.min(s, i);
        }
        if(K>N) {
            return 0;
        }else if(K==N) {
            return s;
        }
        s=0;
        int ans = 0;
        while(s<=e) {
            int m = s+(e-s)/2;
            int index = check(arr, N, m);
            if(index>=K) {
                ans = m;
                s = m+1;
            }else {
                e = m-1;
            }
        }
        return ans;
    }
    private static int check(int[] arr, int N, int m) {
        int currSum = 0;
        int index = 0;
        for(int i:arr) {
            currSum += i;
            if(currSum>=m) {
                currSum = 0;
                index++;
            }
        }
        return index;
    }
}
