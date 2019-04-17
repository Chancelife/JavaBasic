package DesignPattern.Factory;

public class Run {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape shape1 = factory.getShape(Factory.ShapeType.CIRCLE);
        shape1.draw();
    }
}
