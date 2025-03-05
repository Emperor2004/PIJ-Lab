
class Cylinder extends Shape implements Volume {

    public Cylinder(double radius, double height) {
        super(radius, height, 0); // Needs radius and height
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * dim_one * (dim_one + dim_two); // Surface area formula: 2πr(h + r)
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * dim_one; // Perimeter of circular base
    }

    @Override
    public double calculateVolume() {
        return Math.PI * dim_one * dim_one * dim_two; // πr²h for volume
    }
}
