/*
Name: Om Narayan Pandit
PRN: 23070126083
Batch: AIML B1
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner object for user input
        
        while (true) { // Infinite loop to keep showing the menu until exit
            System.out.println("\nSelect Shape to Calculate:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt(); // Read user's choice
            Shape shape = null;
            
            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scan.nextDouble(); // Read radius input
                    shape = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = scan.nextDouble(); // Read length input
                    System.out.print("Enter width: ");
                    double width = scan.nextDouble(); // Read width input
                    shape = new Rectangle(length, width);
                    break;
                case 3:
                    System.out.print("Enter side length: ");
                    double side = scan.nextDouble(); // Read side length for square
                    shape = new Square(side);
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    radius = scan.nextDouble(); // Read radius input for sphere
                    shape = new Sphere(radius);
                    break;
                case 5:
                    System.out.print("Enter radius: ");
                    radius = scan.nextDouble(); // Read radius input for cylinder
                    System.out.print("Enter height: ");
                    double height = scan.nextDouble(); // Read height input for cylinder
                    shape = new Cylinder(radius, height);
                    break;
                case 6:
                    System.out.print("Enter base length: ");
                    double base = scan.nextDouble(); // Read base length for pyramid
                    System.out.print("Enter height: ");
                    height = scan.nextDouble(); // Read height input for pyramid
                    shape = new EquilateralPyramid(base, height);
                    break;
                case 7:
                    System.out.println("Exiting Program...");
                    scan.close(); // Close scanner before exiting
                    return; // Exit program
                default:
                    System.out.println("Invalid Choice! Try Again.");
                    continue; // Restart loop for a valid choice
            }
            
            // Display calculated values
            System.out.println("\nArea: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            
            // If the shape supports volume calculation, display it
            if (shape instanceof Volume) {
                System.out.println("Volume: " + ((Volume) shape).calculateVolume());
            }
            System.out.println("------------------------------------");
        }
    }
}
