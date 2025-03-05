abstract class Shape {
    protected double dim_one, dim_two, dim_three;

    public Shape(double dim_one, double dim_two, double dim_three) {
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
    }
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
