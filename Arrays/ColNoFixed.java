package Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };

        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < arr[index].length; i++) {
                System.out.print(arr[index][i] + " ");
            }
            System.out.println();
        }
    }
}
