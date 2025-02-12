class Triangle extends Shape {

    public Triangle(double side_a, double  side_b, double side_c) {
        super(side_a, side_b, side_c, 3);
    }

    public double calculateArea() {
        double s = (dim_one + dim_two + dim_three)/2;
        return Math.sqrt(s*(s-dim_one)*(s-dim_two)*(s-dim_three));
    }

    public double calculatePerimeter() {
        return (dim_one + dim_two + dim_three);
    }
}