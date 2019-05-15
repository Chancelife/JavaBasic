package DesignPattern.DIP;

public class BMW extends AbstractCar {

    @Override
    public void drive() {
        System.out.println("Driving BMW");
    }

    @Override
    public void stop() {
        System.out.println("Stop driving BMW");
    }
}
