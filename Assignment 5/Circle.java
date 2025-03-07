
class Circle extends Shape {

    // Constructor for Circle, initializes the radius
    public Circle(double radius) {
        super(radius, 0, 0); // Calls parent constructor, only radius is needed
    }

    @Override
    public double calculateArea() {
        // Area of a circle: π * r^2
        return Math.PI * dim_one * dim_one;
    }

    @Override
    public double calculatePerimeter() {
        // Circumference of a circle: 2 * π * r
        return 2 * Math.PI * dim_one;
    }
}
