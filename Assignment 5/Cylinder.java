
class Cylinder extends Shape implements Volume {

    public Cylinder(double radius, double height) {
        super(radius, height, 0);
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * dim_one * (dim_one + dim_two);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * dim_one;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * dim_one * dim_one * dim_two;
    }
}
