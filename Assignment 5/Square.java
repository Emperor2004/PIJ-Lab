
class Square extends Shape {

    public Square(double side) {
        super(side, 0, 0); // Square needs only one side length
    }

    @Override
    public double calculateArea() {
        return dim_one * dim_one; // side²
    }

    @Override
    public double calculatePerimeter() {
        return 4 * dim_one; // 4 × side
    }
}
