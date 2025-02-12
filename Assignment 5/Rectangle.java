class Rectangle extends Shape {

    public Rectangle(double length, double width) {
        super(length, width, 0, 4); // It will call the parameterized constructor of Parent class
    }

    public double calculateArea() {
        return dim_one * dim_two;
    }

    public double calculatePerimeter() {
        return 2 * (dim_one + dim_two);
    }
}