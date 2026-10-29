package Recursion.String;

public class Question {
    public static void main(String[] args) {
        dice("", 6);
    }
    static void dice(String p, int target) {
        if(target==0) {
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6; i++) {
            if(i<=target) {
                dice(p+i, target-i);
            }
        }
        return;
    }
}
