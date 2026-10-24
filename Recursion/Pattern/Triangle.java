package Recursion.Pattern;

public class Triangle {
    public static void main(String[] args) {
        Pat(4, 0);
        Pat2(4, 0);
    }
    private static void Pat(int row, int col) {
        if(row==0) return; 
        
        if(col<row){
            System.out.print("* ");
            Pat(row, ++col);
        }else {
            System.out.println();
            Pat(row-1, 0);
        }
    }
    private static void Pat2(int row, int col) {
        if(row==0) return; 
        
        if(col<row){
            Pat2(row, ++col);
            System.out.print("* ");
        }else {
            Pat2(row-1, 0);
            System.out.println();
        }
    }
}
