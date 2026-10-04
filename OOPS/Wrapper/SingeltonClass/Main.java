package OOPS.Wrapper.SingeltonClass;

public class Main {
    public static void main(String[] args) {
        Singleton num1 = Singleton.getInstance();
        Singleton num2 = Singleton.getInstance();
        Singleton num3 = Singleton.getInstance();
        Singleton num4 = Singleton.getInstance();
    }
}
