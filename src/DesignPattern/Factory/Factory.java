package DesignPattern.Factory;

public class Factory {
    public enum ShapeType{
        CIRCLE,
        SQUARE
    }
    public Shape getShape(ShapeType type) {
        if(type==null)
            return null;
        if(type==ShapeType.CIRCLE)
            return new Circle();
        if(type==ShapeType.SQUARE)
            return new Square();
        return null;
    }
}
