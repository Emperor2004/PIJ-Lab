
class Circle extends Shape {

    public Circle(double radius) {
        super(radius, 0, 0); // Only radius is needed
    }

    @Override
    public double calculateArea() {
        return Math.PI * dim_one * dim_one; // πr² formula for area
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * dim_one; // 2πr formula for circumference
    }
}
