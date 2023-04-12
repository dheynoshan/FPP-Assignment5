package problem1;

public class Main {
    public static void printTotal(Shape[] shapes){
        for (Shape sh : shapes) {
            System.out.println("Area of the " + sh.getClass().getSimpleName()+": " + sh.calculateArea());
            System.out.println("Perimeter of the " + sh.getClass().getSimpleName()+ ": " + sh.calculatePerimeter());
        }
    }
    public static void main(String[] args) {
        Shape[] shapes = {new Circle("Red", 7), new Rectangle("Blue",10, 12),
                            new Square("Green", 13), new Circle("Brown", 12),
                            new Square("Orange", 5.5)};
        printTotal(shapes);

    }
}
