public class Main {
    public static void main(String[] args) {
    Shape circle =  new Circle();
    Shape triangle = new Triangle();
    Shape quad =  new Quad();
    Shape trapezoid = new Trapezoid();
    Shape rectangle = new Rectangle();
    ShapePrinter shapePrinter = new ShapePrinter();
    shapePrinter.printShapeName(circle);
    shapePrinter.printShapeName(triangle);
    shapePrinter.printShapeName(quad);
    shapePrinter.printShapeName(trapezoid);
    shapePrinter.printShapeName(rectangle);








    }

}