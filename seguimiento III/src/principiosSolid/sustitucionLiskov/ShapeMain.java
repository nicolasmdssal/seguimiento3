package principiosSolid.sustitucionLiskov;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rect = new Rectangulo(5, 10);
        System.out.println("Rectangle Area: " + rect.getArea());

        Shape square = new Square(5);
        System.out.println("Square Area: " + square.getArea());
    }
}
