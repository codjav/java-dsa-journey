package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4);
        System.out.println(box.l+" "+box.h+" "+box.w);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.h+" "+box3.w+" "+box3.l+" "+box3.weight);

        BoxWeight box4 = new BoxWeight(1,2,3,4);
        System.out.println(box4.h+" "+box4.w+" "+box4.l+" "+box4.weight);

        box3.greeting();
    }
}
