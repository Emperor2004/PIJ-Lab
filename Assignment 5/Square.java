
class Square extends Shape {

    // Constructor for Square, initializes side length
    public Square(double side) {
        super(side, 0, 0); // Calls parent constructor, only side length is needed
    }

    @Override
    public double calculateArea() {
        // Area of a square: side^2
        return dim_one * dim_one;
    }

    @Override
    public double calculatePerimeter() {
        // Perimeter of a square: 4 * side
        return 4 * dim_one;
    }
}
