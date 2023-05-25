class Shape {
    public void calculateArea() {
        System.out.println("Calculating area of a shape.");
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
}

public class polymorphism_sample {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(4.0, 6.0);
        
        shape1.calculateArea(); // Calls the overridden method in Circle class
        shape2.calculateArea(); // Calls the overridden method in Rectangle class
    }
}
