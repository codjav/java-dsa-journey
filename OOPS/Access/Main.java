package OOPS.Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "javed");

        // System.out.println(obj.num); -- can't access num becuase its private
        
        obj.getNum();
    }
}
