package OOPS.Wrapper.Static;

public record StaticBlock() {
    static int a = 4;
    static int b;

    // static block will run only once when first object is created i.e. class is loaded for the first time.
    static{
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " and " + StaticBlock.b);

        b += 20;

        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " and " + StaticBlock.b);
    }
}
