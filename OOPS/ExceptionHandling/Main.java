package OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 90;
        try {
            if(a==0) {
                throw new MyException("A is zero");
            }
            System.out.println(divide(a, b));
        } catch(MyException e) {
            System.out.println(e.getMessage());
        }  catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("Normal exception");
        } finally {
            System.out.println("It will run always");
        }
    }

    static int divide(int a , int b) throws ArithmeticException {
        if(b==0) {
            throw new ArithmeticException("Please do not divide by zero.");
        }
        return a/b;
    }
}
