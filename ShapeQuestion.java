// Question 1: Implement a Shape class with method area(), and override it in Circle, Rectangle.


class Shape{
    void Area(){
        System.out.println("This represents the area of different shapes");
    }
}

class Circle extends Shape{
    void Area(){
        super.Area(); // use of super keyword
        System.out.println("This represents the area of Circle");
    }
}

class Rectangle extends Shape{
    void Area(){
        System.out.println("This represents the area of Ractangle");
    }
}

public class ShapeQuestion {

    public static void main(String[] args) {
        Shape a = new Circle();
        a.Area();

        Shape b = new Rectangle();
        b.Area();

        Shape c = new Shape();
        c.Area();


    }
}
