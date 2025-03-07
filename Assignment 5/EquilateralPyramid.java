
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
        double halfDiagonal = (Math.sqrt(2) * dim_one) / 2;
        double height = Math.sqrt((dim_one * dim_one) - (halfDiagonal * halfDiagonal)); // verticle height
        return (dim_one * dim_one * height) / 3; // (1/3) × base area × height
    }
}
