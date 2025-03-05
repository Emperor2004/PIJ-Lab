
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect Shape to Calculate:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();
            Shape shape = null;
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter radius: ");
                    double radius = scan.nextDouble();
                    shape = new Circle(radius);
                }
                case 2 -> {
                    System.out.print("Enter length: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scan.nextDouble();
                    shape = new Rectangle(length, width);
                }
                case 3 -> {
                    System.out.print("Enter side length: ");
                    double side = scan.nextDouble();
                    shape = new Square(side);
                }
                case 4 -> {
                    System.out.print("Enter radius: ");
                    double radius = scan.nextDouble();
                    shape = new Sphere(radius);
                }
                case 5 -> {
                    System.out.print("Enter radius: ");
                    double radius = scan.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scan.nextDouble();
                    shape = new Cylinder(radius, height);
                }
                case 6 -> {
                    System.out.print("Enter base length: ");
                    double base = scan.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scan.nextDouble();
                    shape = new EquilateralPyramid(base, height);
                }
                case 7 -> {
                    System.out.println("Exiting Program...");
                    scan.close();
                    return;
                }
                default -> {
                    System.out.println("Invalid Choice! Try Again.");
                    continue;
                }
            }
            System.out.println("\nArea: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            if (shape instanceof Volume volume) {
                System.out.println("Volume: " + volume.calculateVolume());
            }
            System.out.println("------------------------------------");
        }
    }
}
