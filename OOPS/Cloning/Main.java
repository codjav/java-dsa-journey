package OOPS.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Javed = new Human(23, "javaed");
        // Human Imran = new Human(Javed);

        Human Imran = (Human)Javed.clone();
    }
}
