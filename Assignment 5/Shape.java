// Abstract Base Class

abstract class Shape {

    protected double dim_one, dim_two, dim_three; // Dimensions of the shape

    // Constructor to initialize dimensions
    public Shape(double dim_one, double dim_two, double dim_three) {
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
    }

    public abstract double calculateArea(); // Abstract method to calculate area

    public abstract double calculatePerimeter(); // Abstract method to calculate perimeter
}
