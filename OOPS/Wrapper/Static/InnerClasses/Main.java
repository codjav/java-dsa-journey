package OOPS.Wrapper.Static.InnerClasses;

class Test3{
    static String name;

    public Test3(String name) {
        Test3.name = name;
    }
}

public class Main {
    class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    static class Test1{
        String name;

        public Test1(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Main.Test javed = obj.new Test("javedali");

        Test1 javed1 = new Test1("javedali1");
        System.out.println(javed1.name);

        Test3 javed3 = new Test3("javedali3");
        System.out.println(Test3.name);
        System.out.println(javed3.name);
    }
}
