package OOPS.Interface;

public class DeiselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("This is a power engine");
    }
    @Override
    public void stop() {
        System.out.println("Power engine Stopped");
    }
    @Override
    public void accelerate() {
        System.out.println("PowerEngine will accelerate");
    }
}
