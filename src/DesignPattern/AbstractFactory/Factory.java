package DesignPattern.AbstractFactory;

public class Factory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
