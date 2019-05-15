package DesignPattern.DIP;

public class Benz extends AbstractCar {
    @Override
    public void drive() {
        System.out.println("Driving Benz");
    }

    @Override
    public void stop() {
        System.out.println("Stop driving Benz");
    }
}
