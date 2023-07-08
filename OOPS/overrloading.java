package OOPS;

class Shape {
    protected int length;
    protected int width;

    public Shape(int l, int w) {
        length = l;
        width = w;
    }

    // Changing getArea() to a virtual-like function
    public int getArea() {
        System.out.println("This is a call to the parent class area");
        return 0;
    }
}

// Derived class
class Square extends Shape {
    public Square(int l, int w) {
        super(l, w); // Calling the base class constructor
    }

    public int getArea() {
        int area = length * width;
        System.out.println("Square area: " + area);
        return area;
    }
}

// Derived class
class Rectangle extends Shape {
    public Rectangle(int l, int w) {
        super(l, w); // Calling the base class constructor
    }

    public int getArea() {
        int area = length * width;
        System.out.println("Rectangle area: " + area);
        return area;
    }
}

public class overrloading {
    // Base class

    public class Main {
        public static void main(String[] args) {
            Shape s = new Shape(2, 2);
            s.getArea();
            System.out.println(s);
            Square sq = new Square(5, 5); // Creating an object of the child class Square
            Rectangle rec = new Rectangle(4, 5); // Creating an object of the child class Rectangle
            s = sq;
            System.out.println(s);
            s.getArea();
            s = rec;
            System.out.println(s);
            s.getArea();
        }
    }

}
