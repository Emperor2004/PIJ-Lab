// Main file to provide a menu-driven approach

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            System.out.println("\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Search by Name\n5. Update Student\n6. Delete Student\n7. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter PRN: ");
                    long prn = scan.nextLong();
                    operations.addStudent(new Student(name, prn));
                    break;
                case 2:
                    operations.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter PRN to search: ");
                    prn = scan.nextLong();
                    Student student = operations.searchByPRN(prn);
                    System.out.println(student != null ? "Student Found: " + student.getName() : "Student not found.");
                    break;
                case 4:
                    System.out.print("Enter Name to search: ");
                    name = scan.nextLine();
                    student = operations.searchByName(name);
                    System.out.println(student != null ? "Student Found: " + student.getPRN() : "Student not found.");
                    break;
                case 5:
                    System.out.print("Enter PRN to update: ");
                    prn = scan.nextLong();
                    scan.nextLine(); // Consume newline
                    System.out.print("Enter new name: ");
                    name = scan.nextLine();
                    operations.updateStudent(prn, name);
                    break;
                case 6:
                    System.out.print("Enter PRN to delete: ");
                    prn = scan.nextLong();
                    operations.deleteStudent(prn);
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);
        scan.close();
    }
}