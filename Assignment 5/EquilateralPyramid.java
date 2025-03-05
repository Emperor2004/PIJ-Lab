
class EquilateralPyramid extends Shape implements Volume {

    public EquilateralPyramid(double base, double height) {
        super(base, height, 0); // Needs base length and height
    }

    @Override
    public double calculateArea() {
        double baseArea = dim_one * dim_one; // Base is a square (side²)
        double slantHeight = Math.sqrt((dim_one / 2) * (dim_one / 2) + dim_two * dim_two); // Slant height formula
        double lateralArea = 2 * dim_one * slantHeight; // Lateral surface area
        return baseArea + lateralArea; // Total surface area
    }

    @Override
    public double calculatePerimeter() {
        return 4 * dim_one; // Perimeter of the square base
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * dim_one * dim_one * dim_two; // (1/3) × base area × height
    }
}
