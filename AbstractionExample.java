abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw(){
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

class Hexagon extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Hexagon");
    }
}
class Star extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Star");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();
        Shape star = new Star();

        circle.draw();
        rectangle.draw();
        triangle.draw();
        hexagon.draw();
        star.draw();
    }
}