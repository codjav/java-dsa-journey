package OOPS.Interface;

public class NiceCar {
    private Engine engine;
    private Brake brake;
    private Media media = new CDPlayer();

    public NiceCar() {
        this.engine = new DeiselEngine();
        this.brake = new Brakes();
    }
    public NiceCar(Engine engine, Brake brake) {
        this.engine = engine;
        this.brake = brake;
    }
    public void start() {
        this.engine.start();
    }
    public void stop() {
        this.engine.stop();
    }

    public void music() {
        this.media.start();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }

    public void brake() {
        this.brake.brake();
    }
}
