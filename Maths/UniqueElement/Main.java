package Maths.UniqueElement;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,4,3,2};
        System.out.println(Uniques(arr));
    }
    private static int Uniques(int[] arr) {
        int unique = 0;

        for(int i:arr) {
            unique ^= i;
        }

        return unique;
    }
}
