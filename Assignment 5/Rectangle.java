
class Rectangle extends Shape {

    // Constructor for Rectangle, initializes length and width
    public Rectangle(double length, double width) {
        super(length, width, 0); // Calls parent constructor, only length and width are needed
    }

    @Override
    public double calculateArea() {
        // Area of a rectangle: length * width
        return dim_one * dim_two;
    }

    @Override
    public double calculatePerimeter() {
        // Perimeter of a rectangle: 2 * (length + width)
        return 2 * (dim_one + dim_two);
    }
}
