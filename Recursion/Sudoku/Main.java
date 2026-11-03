package Recursion.Sudoku;

public class Main {
    public static void main(String[] args) {
        int[][] board = {
    {7, 0, 0, 6, 0, 5, 0, 0, 4},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 1, 9, 4, 7, 6, 0, 0},
    {0, 9, 0, 0, 0, 0, 0, 4, 0},
    {1, 0, 4, 0, 6, 0, 2, 0, 7},
    {0, 0, 0, 4, 5, 1, 0, 0, 0},
    {9, 0, 6, 0, 1, 0, 8, 0, 2},
    {8, 4, 0, 0, 3, 0, 0, 1, 6},
    {0, 0, 0, 0, 0, 0, 0, 0, 0}
};
        Sudoku(board);
    }
    static boolean Sudoku(int[][] board) {
        int n = board.length;
        int r = -1;
        int c = -1;

        boolean empty = false;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j]==0) {
                    r=i;
                    c=j;
                    empty = true;
                    break;
                }
            }
            if(empty==true) {
                break;
            }
        }
        // Base case: if no empty cells remain, puzzle is solved!
        if(empty==false) {
            display(board); // Print the final solved board here
            return true;
        }

        for(int num=1; num<=9; num++) {
            if(isSafe(board, r, c, num)) {
                board[r][c] = num;
                
                // If going deeper solves the puzzle, propagate true up
                if(Sudoku(board)) {
                    return true;
                }
                
                // Backtrack if it didn't lead to a solution
                board[r][c] = 0;
            }
        }

        return false;
    }
    static void display(int[][] board) {
        for(int[] i:board) {
            for(int j:i) {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        return;
    }
    static boolean isSafe(int[][] board, int r, int c, int num) {
        // In the row
        for(int i=0; i<board.length; i++) {
            if(board[r][i] == num) {
                return false;
            }
        }
        // In the column
        for(int i=0; i<board[0].length; i++) {
            if(board[i][c] == num) {
                return false;
            }
        }
        // In the square
        int sqrt = (int)(Math.sqrt(board.length));
        int rs = r-r%sqrt;
        int cs = c-c%sqrt;
        for(int i=rs; i<rs+sqrt; i++) {
            for(int j=cs; j<cs+sqrt; j++) {
                if(board[i][j]==num) {
                    return false;
                }
            }
        }

        return true;
    }
}
