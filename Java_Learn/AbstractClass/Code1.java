/*
 Create an abstract class named Shape. Define an abstract method called calculateArea(). 
Create two subclasses Circle and Rectangle that extend the Shape class. Implement the 
calculateArea() method in each subclass to calculate the area of a
circle and a rectangle, respectively.
 */
abstract class Shape{
    public abstract double calculateArea();
}
class Rectangle extends Shape{
    double radius;
    public Rectangle(int r){
        this.radius=r;
    }
    public double calculateArea(){
        return 3.14*radius*radius;
    }
}
class Circle extends Shape{
    double length, bredth;
    public Circle(int l , int b){
        length=l;
        bredth=b;
    }
    public double calculateArea(){
        return length*bredth;
    }
}
class Code1{
    public static void main(String[] args) {
        Rectangle r =new Rectangle(100);
        Circle c = new Circle(10,20);
        System.out.println("The area of rectangle is: "+r.calculateArea());
        System.out.println("The area of circle is: "+c.calculateArea());
    }
}