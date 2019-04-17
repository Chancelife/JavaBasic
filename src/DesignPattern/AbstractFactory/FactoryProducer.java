package DesignPattern.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean round) {
        if(round) {
            return new RoundedShapeFactory();
        } else {
            return new Factory();
        }
    }

}
