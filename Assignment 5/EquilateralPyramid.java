
class EquilateralPyramid extends Shape implements Volume {

    // Tetrahedron
    public EquilateralPyramid(double side) {
        super(side, 0, 0); // Needs side length
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(3) * dim_one * dim_one;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * dim_one;
    }

    @Override
    public double calculateVolume() {
        return (Math.sqrt(2) / 12) * dim_one * dim_one * dim_one;
    }
}
