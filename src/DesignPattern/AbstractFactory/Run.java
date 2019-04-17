package DesignPattern.AbstractFactory;

public class Run {
    public static void main(String[] args) {
        AbstractFactory roundfactory = FactoryProducer.getFactory(true);
        Shape shape1 = roundfactory.getShape("SQUARE");
        shape1.draw();

        AbstractFactory factory = FactoryProducer.getFactory(false);
        Shape shape2 = factory.getShape("SQUARE");
        shape2.draw();
    }
}
