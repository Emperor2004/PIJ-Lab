
// Abstract Base Class
abstract class Shape {

    // Protected variables to store dimensions of the shape
    protected double dim_one, dim_two, dim_three;

    // Constructor to initialize the shape's dimensions
    public Shape(double dim_one, double dim_two, double dim_three) {
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
    }

    // Abstract method to calculate the area
    public abstract double calculateArea();

    // Abstract method to calculate the perimeter
    public abstract double calculatePerimeter();
}
