package DesignPattern.DIP;

public class DriveMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Benz benz = new Benz();
        driver.drive(benz);
        BMW bmw = new BMW();
        driver.drive(bmw);
    }
}
