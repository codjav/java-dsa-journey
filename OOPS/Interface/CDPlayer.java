package OOPS.Interface;

public class CDPlayer implements Media{
    public void start() {
        System.out.println("Started playing music.");
    }
    public void stop() {
        System.out.println("Stopped playing music.");
    }
}
