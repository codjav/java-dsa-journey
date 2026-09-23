package Pattern;

public class pattern {
    public static void main(String[] args) {
        pattern31(3);
    }
    private static void pattern2(int num) {
        for(int i=0; i<=num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern3(int num) {
        for(int i=num; i>=0; i--) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern5(int n) {
        for(int i=1; i<n*2; i++) {
            int c=(i>n) ?n*2-i : i;
            for(int j=1; j<=c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern28(int n) {
        for(int i=1; i<n*2; i++) {
            int colj = (i>n) ?n*2-i :i;
            for(int j=1; j<=n-colj; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=colj; j++) {
                System.out.print(" *");
            }
            for(int j=1; j<=n-colj; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void pattern30(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=0; j<=n-i; j++) System.out.print("  ");
            for(int j=i; j>=1; j--) System.out.print(j+" ");
            for(int j=2; j<=i; j++) System.out.print(j+" ");
            System.out.println();
        }
    }
    private static void pattern17(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=0; j<=n-i; j++) System.out.print("  ");
            for(int j=i; j>=1; j--) System.out.print(j+" ");
            for(int j=2; j<=i; j++) System.out.print(j+" ");
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=0; j<=n-i; j++) System.out.print("  ");
            for(int j=i; j>=1; j--) System.out.print(j+" ");
            for(int j=2; j<=i; j++) System.out.print(j+" ");
            System.out.println();
        }
    }
    private static void pattern31(int n) {
        n= n*2;
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=n; j++) {
                int num = n/2+1-Math.min(Math.min(i,j),Math.min(n-i, n-j));
                System.out.print(" "+num+" ");
            }
            System.out.println();
        }
    }
}
