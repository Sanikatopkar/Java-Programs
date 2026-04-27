interface Shape {
    void area();
}

// Rectangle
class Rectangle implements Shape {
    int l = 10, b = 5;

    public void area() {
        System.out.println("Rectangle Area = " + (l * b));
    }
}

// Triangle
class Triangle implements Shape {
    int base = 8, height = 4;

    public void area() {
        System.out.println("Triangle Area = " + (0.5 * base * height));
    }
}

public class Main2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        r.area();
        t.area();
    }
}