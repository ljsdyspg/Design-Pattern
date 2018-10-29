package factory;

public class ShapeFactory {
    public static Shape generateCircle(){
        return new Circle();
    }
    public static Shape generateEclipse(){
        return new Eclipse();
    }
    public static Shape generateRectangle(){
        return new Rectangle();
    }
}
