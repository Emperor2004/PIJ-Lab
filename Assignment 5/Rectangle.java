class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width, 0);
    }

    @Override
    public double calculateArea() {
        return dim_one * dim_two;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (dim_one + dim_two);
    }
}
