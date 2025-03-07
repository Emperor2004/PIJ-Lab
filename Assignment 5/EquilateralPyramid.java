
class EquilateralPyramid extends Shape implements Volume {

    // Constructor for Equilateral Pyramid (Square Base)
    public EquilateralPyramid(double side) {
        super(side, 0, 0); // Only side length is needed
    }

    @Override
    public double calculateArea() {
        // Base Area = s^2
        double baseArea = dim_one * dim_one;

        // Lateral Surface Area = sqrt(3) * s^2
        double lateralArea = Math.sqrt(3) * dim_one * dim_one;

        // Total Surface Area = Base Area + Lateral Area
        return baseArea + lateralArea;
    }

    @Override
    public double calculatePerimeter() {
        // Perimeter of square base = 4 * s
        return 4 * dim_one;
    }

    @Override
    public double calculateVolume() {
        // Volume = (sqrt(2) / 6) * s^3
        return (Math.sqrt(2) / 6) * Math.pow(dim_one, 3);
    }
}
