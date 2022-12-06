package creational.AbstractFactory;

public abstract class AbstractFactory {
    abstract IShape getShape (String shape);
    abstract IShape fillColor(String color);

}
