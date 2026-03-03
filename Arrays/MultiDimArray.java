package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            1   2   3   4 
            5   6   7   8 
            9  10  11  12
         */

        int[][] array = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        
        int[][] arr = new int[3][4];

        // Input using loop - 
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // // Output using loop - 
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(Arrays.toString(array[i]));
        // }

        for (int[] is : array) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }
    }
}
