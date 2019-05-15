package DesignPattern.DIP;

public class DriveMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Benz car = new Benz();
        driver.drive(car);
    }
}
