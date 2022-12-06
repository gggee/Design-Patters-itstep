package creational.AbstractFactory;

public class Main {
    public static void main (String []args){
    AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

    IShape shapeCircle = shapeFactory.getShape("Circle");
    shapeCircle.drawShape();

    IShape shapeCircle1 = shapeFactory.getShape("Rectangle");
    shapeCircle1.drawShape();

    IShape shapeCircle2 = shapeFactory.getShape("Circle");
    shapeCircle2.drawShape();
    }
}

