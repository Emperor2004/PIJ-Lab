
class Cylinder extends Shape implements Volume {

    // Constructor for Cylinder, initializes radius and height
    public Cylinder(double radius, double height) {
        super(radius, height, 0); // Calls parent constructor, only radius and height are needed
    }

    @Override
    public double calculateArea() {
        // Surface area of a cylinder: 2 * π * r * (r + h)
        return 2 * Math.PI * dim_one * (dim_one + dim_two);
    }

    @Override
    public double calculatePerimeter() {
        // Circumference of the base (used as perimeter): 2 * π * r
        return 2 * Math.PI * dim_one;
    }

    @Override
    public double calculateVolume() {
        // Volume of a cylinder: π * r^2 * h
        return Math.PI * dim_one * dim_one * dim_two;
    }
}
