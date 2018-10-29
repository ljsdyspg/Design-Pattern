package factory;

public class Test {
    public static void main(String[] args) {

        Shape shape1;
        Shape shape2;
        Shape shape3;

        shape1 = ShapeFactory.generateCircle();
        shape2 = ShapeFactory.generateEclipse();
        shape3 = ShapeFactory.generateRectangle();

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
