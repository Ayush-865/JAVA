class Shape {
    private double area;

    public Shape() {
        area = 0;
    }

    public Shape(double area) {
        this.area = area;
    }

    public Shape(Shape shape) {
        this.area = shape.area;
    }

    public void displayArea() {
        System.out.println("Area: " + area);
    }
}

class Square extends Shape {
    public Square(double side) {
        super(side * side);
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length * width);
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
    }
}

public class AreaExample {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.displayArea();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.displayArea();

        Rectangle rectangleCopy = new Rectangle(rectangle);
        rectangleCopy.displayArea();
    }
}
