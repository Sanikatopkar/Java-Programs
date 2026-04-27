// Abstract class
abstract class Shape {
    abstract void dim1();   // abstract method
    abstract void dim2();   // abstract method
    abstract void area();   // abstract method
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    void dim1() {
        length = 10;
    }

    void dim2() {
        breadth = 5;
    }

    void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    void dim1() {
        base = 8;
    }

    void dim2() {
        height = 4;
    }

    void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }
}

// Main class
public class ShapeTest {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.dim1();
        r.dim2();
        r.area();

        Triangle t = new Triangle();
        t.dim1();
        t.dim2();
        t.area();
    }
}