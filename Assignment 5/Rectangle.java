
class Rectangle extends Shape {

    public Rectangle(double length, double width) {
        super(length, width, 0); // Rectangle needs length and width
    }

    @Override
    public double calculateArea() {
        return dim_one * dim_two; // length × width
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (dim_one + dim_two); // 2(l + w)
    }
}
