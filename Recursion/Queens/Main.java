package Recursion.Queens;

public class Main {
    public static void main(String[] args) {
        boolean[][] board = {
            {false, false, false, false},
            {false, false, false, false},
            {false, false, false, false},
            {false, false, false, false}
        };
        System.out.println(Ways(board, 0));
    }

    static int Ways(boolean[][] board, int r) {
        if(r==board.length) {
            display(board);
            return 1;
        }
        int count = 0;
        for(int c=0; c<board[0].length; c++) {
            if(isSafe(board, r, c)) {
                board[r][c] = true;
                count += Ways(board, r+1);
                board[r][c] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int r, int c) {
        // 1. Check vertical column upward
        for(int i=0; i<r; i++) {
            if(board[i][c] == true) return false;
        }
        // 2. Diagonal left upward
        for(int i=1; i<=Math.min(r, c); i++) {
            if(board[r-i][c-i]) return false;
        }
        // 3. Diagonal right upward
        for(int i=1; i<=Math.min(r, board[0].length-c-1); i++) {
            if(board[r-i][c+i]) return false;
        }
        return true;
    }

    static void display(boolean[][] board) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j]) {
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
        return;
    }
}
