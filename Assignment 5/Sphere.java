
class Sphere extends Shape implements Volume {

    // Constructor for Sphere, initializes radius
    public Sphere(double radius) {
        super(radius, 0, 0); // Calls parent constructor, only radius is needed
    }

    @Override
    public double calculateArea() {
        // Surface area of a sphere: 4 * π * r^2
        return 4 * Math.PI * dim_one * dim_one;
    }

    @Override
    public double calculatePerimeter() {
        // A sphere does not have a perimeter, so return 0
        return 0;
    }

    @Override
    public double calculateVolume() {
        // Volume of a sphere: (4/3) * π * r^3
        return (4.0 / 3.0) * Math.PI * Math.pow(dim_one, 3);
    }
}
