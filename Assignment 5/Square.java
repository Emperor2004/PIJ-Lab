class Square extends Shape {
    public Square(double side) {
        super(side, 0, 0);
    }

    @Override
    public double calculateArea() {
        return dim_one * dim_one;
    }
    
    @Override
    public double calculatePerimeter() {
        return 4 * dim_one;
    }
}
