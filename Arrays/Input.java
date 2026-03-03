package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Direct Input 
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 6;
        arr[4] = 7;

        // Input using loop 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        for (int num:arr) {
            System.out.println(num);
        }
        for (int num:arr) {
            System.out.print(num +  " ");
        }

        change(arr);

        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void change(int[] arr) {
        arr[0] = 7488;
    }
}
