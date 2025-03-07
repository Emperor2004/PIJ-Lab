
class EquilateralPyramid extends Shape implements Volume {

    public EquilateralPyramid(double side) {
        super(side, 0, 0); // Needs side length
    }

    @Override
    public double calculateArea() {
        return (1 + Math.sqrt(3)) * dim_one; // Total surface area
    }

    @Override
    public double calculatePerimeter() {
        return 8 * dim_one; // Perimeter of the square and equilateral triangle
    }

    @Override
    public double calculateVolume() {
        double slantHeight = Math.sqrt(3) / 4 * dim_one; // slant height
        double height = Math.sqrt(slantHeight * slantHeight - (dim_one / 2) * (dim_one / 2)); // verticle height
        return (1.0 / 3.0) * dim_one * dim_one * height; // (1/3) × base area × height
    }
}
