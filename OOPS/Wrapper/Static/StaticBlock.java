package OOPS.Wrapper.Static;

// This is to show initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b; 

    static{
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.err.println(obj);
        System.err.println(StaticBlock.a);
        System.err.println(StaticBlock.b);
    }
}
