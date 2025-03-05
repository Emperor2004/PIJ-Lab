class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0, 0);
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * dim_one * dim_one;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * dim_one;
    }
}
