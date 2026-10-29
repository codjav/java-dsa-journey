package Recursion.BackTrack;
import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        allPath("", 0, 0, board);

        int[][] arr = new int[3][3];
        allPathName("", 0, 0, board, arr, 1);
    }

    static void allPath(String p, int r, int c, boolean[][] board) {
        if(r==board.length-1 && c==board[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!board[r][c]) {
            return;
        }
        board[r][c] = false;
        if(r<board.length-1) {
            allPath(p+'D', r+1, c, board);
        }
        if(c<board[0].length-1) {
            allPath(p+'R', r, c+1, board);
        }
        if(c>0) {
            allPath(p+'U', r, c-1, board);
        }
        if(r>0) {
            allPath(p+'L', r-1, c, board);
        }
        board[r][c] = true;
        return;
    }

    static void allPathName(String p, int r, int c, boolean[][] board, int[][] arr, int step) {
        if(r==board.length-1 && c==board.length-1) {
            arr[r][c] = step;
            System.out.println(step);
            for(int[] i:arr) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!board[r][c]) {
            return;
        }

        board[r][c] = false;
        arr[r][c] = step;
        if(r<board.length-1) {
            allPathName(p+'D', r+1, c, board, arr, step+1);
        }
        if(c<board[0].length-1) {
            allPathName(p+'R', r, c+1, board, arr, step+1);
        }
        if(r>0) {
            allPathName(p+'U', r-1, c, board, arr, step+1);
        }
        if(c>0) {
            allPathName(p+'L', r, c-1, board, arr, step+1);
        }
        board[r][c] = true;
        arr[r][c] = 0;
        return;
    }
}
