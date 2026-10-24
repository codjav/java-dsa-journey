package Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,5,5,5,6,7,8,9,9,9,100};
        int a = Search(arr, 0, arr.length, 70);
        System.out.println(a);
        FirstAndLastIndex(arr, 0, arr.length, 5);
        System.out.println(list.get(0)+" "+list.get(list.size()-1));
        System.out.println(FirstAndLastIndex2(arr, 0, arr.length, 9).toString());
    }
    static ArrayList<Integer> list = new ArrayList<>();
    private static int Search(int[] arr, int i, int n, int target) {
        // Base Case
        if(i==n) return -1;
        // If found
        if(arr[i]==target) return i;
        // If not found
        return Search(arr, ++i, n, target);
    }

    // Method 1 for first and last index
    private static void FirstAndLastIndex(int[] arr, int i, int n, int target) {
        // Base Case
        if(i==n) return;
        // If found
        if(arr[i]==target) list.add(i);
        // If not found
        FirstAndLastIndex(arr, ++i, n, target);
    }

    // Method 2 for first and last index
    private static ArrayList<Integer> FirstAndLastIndex2(int[] arr, int i, int n, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if(i==n) return list;
        if(arr[i]==target) {
            list.add(i);
        }
        ArrayList<Integer> list2 = FirstAndLastIndex2(arr, ++i, n, target);

        list.addAll(list2);
        return list;
    }
}
