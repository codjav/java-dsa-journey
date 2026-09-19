package OOPS.Wrapper.SingeltonClass;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance("javed");
        Singleton obj2 = Singleton.getInstance("Imran");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}

