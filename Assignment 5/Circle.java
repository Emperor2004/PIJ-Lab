class Circle extends Shape {

    public Circle(double radius) {
        super(radius, 0, 0, 0);
    }

    public double calculateArea() {
        return 3.14 * dim_one * dim_one;
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * dim_one;
    }
}