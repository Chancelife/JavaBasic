package DesignPattern.DIP;

public class Driver extends AbstractDriver {
    private AbstractCar car;
    @Override
    public void drive(AbstractCar car) {
        this.car = car;
        this.car.drive();
    }
}
