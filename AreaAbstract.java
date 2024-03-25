import java.util.*;

abstract class Circle {
    abstract void area(int r);
    abstract void rectangle(int l, int b);
    abstract void triangle(int base, int height);
}

class Example extends Circle {
    public void area(int r) {
        System.out.println("Area Circle: " + 3.14 * r * r);
    }

    public void rectangle(int l, int b) {
        System.out.println("Area Rectangle: " + l * b);
    }

    public void triangle(int base, int height) {
        System.out.println("Area Triangle: " + ((base * height) / 2));
    }
}

class AreaAbstract {
    public static void main(String args[]) {
        Example obj1 = new Example();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter radius");
        int r = obj.nextInt();
        obj1.area(r);
        System.out.println("Enter length and breath");
        int l = obj.nextInt();
        int b = obj.nextInt();
        obj1.rectangle(l, b);
        System.out.println("Enter base and height");
        int base = obj.nextInt();
        int height = obj.nextInt();
        obj1.triangle(base, height);
    }
}
