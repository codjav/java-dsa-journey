package Recursion.Knight;

public class Main {
    public static void main(String[] args) {
        boolean[][] board = {
            {false, false, false},
            {false, false, false},
            {false, false, false}
        };
        Knight(board, 0, 0, 3);
    }

    static void Knight(boolean[][] board, int r, int c, int k) {
        if(k==0) {
            display(board);
            System.out.println();
            return;
        }
        if(r == board.length) {
            return;
        }
        if(c==board.length) {
            Knight(board, r+1, 0, k);
            return;
        }
        if(isSafe(board, r, c)) {
            board[r][c] = true;
            Knight(board, r, c+1, k-1);
            board[r][c] = false;
        }
        Knight(board, r, c+1, k);
        return;
    }

    static boolean isSafe(boolean[][] board, int r, int c) {
        if(isValid(board, r-2, c-1)) {
            if(board[r-2][c-1]) {
                return false;
            }
        }
        if(isValid(board, r-1, c-2)) {
            if(board[r-1][c-2]) {
                return false;
            }
        }
        if(isValid(board, r-2, c+1)) {
            if(board[r-2][c+1]) {
                return false;
            }
        }
        if(isValid(board, r-1, c+2)) {
            if(board[r-1][c+2]) {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int r, int c) {
        if(r>=0 && r<board.length && c>=0 && c<board.length) {
            return true;
        }
        return false;
    }

    static void display(boolean[][] board) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j]) {
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        return;
    }
}
