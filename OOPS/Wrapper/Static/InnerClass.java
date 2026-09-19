package OOPS.Wrapper.Static;

public class InnerClass {

    static class Test {
        String name;

        Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("javed");
        Test b = new Test("Mohammad Javed Ali");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
