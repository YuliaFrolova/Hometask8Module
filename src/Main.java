public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape quad = new Quad();
        Shape trapezoid =  new Trapezoid();
        Shape rectangle = new Rectangle();
        circle.printShapeName();
        triangle.printShapeName();
        quad.printShapeName();
        trapezoid.printShapeName();
        rectangle.printShapeName();
    }
}