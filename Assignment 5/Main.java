import  java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter length of Rectangle:");
        // double length = Double.parseDouble(scan.nextLine());
        // System.out.println("Enter width of Rectangle:");
        // double width = Double.parseDouble(scan.nextLine());

        // Shape rectangle = new Rectangle(length, width);
        // System.out.println("-------------------------");
        // System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        // System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
        // System.out.println("Number of sides in Rectangle: " + rectangle.getNumSides());
        // System.out.println("-------------------------");

        System.out.println("Enter radius:");
        double radius = Double.parseDouble(scan.nextLine());

        Shape circle = new Circle(radius);
        System.out.println("-------------------------");
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + Math.floor(circle.calculatePerimeter()));
        System.out.println("Number of sides in Circle: " + circle.getNumSides());
        System.out.println("-------------------------");


    }


}