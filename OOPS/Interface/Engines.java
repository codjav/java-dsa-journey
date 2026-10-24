package OOPS.Interface;

public class Engines implements Engine{
    public void start() {
        System.out.println("Started engine");
    }
    public void stop() {
        System.out.println("Stopped engine");
    }
    public void accelerate() {
        System.out.println("Accelerated engine");
    }
}
