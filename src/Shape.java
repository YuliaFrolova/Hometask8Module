interface PrintName{
    void printShapeName();
}
public class Shape {
    public void addShapeName(PrintName printName) {
        printName.printShapeName();
    }
}
