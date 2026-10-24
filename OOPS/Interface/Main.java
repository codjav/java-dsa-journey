package OOPS.Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        
        car.accelerate();
        car.brake();
        car.start();
        car.stop();

        Engine car1 = new Car();
        car1.start();
        car1.stop();

        System.out.println();
        // Custum Car
        NiceCar myCar = new NiceCar(new Engines(), new Brakes());
        myCar.start();
        myCar.music();
        myCar.upgradeEngine(new DeiselEngine());
        myCar.start();
        myCar.brake();
        myCar.stop();
    }
}
