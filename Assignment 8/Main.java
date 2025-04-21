/*
Name: Om Narayan Pandit
PRN: 23070126083
Batch: AIML B1
*/

// Main file to provide a menu-driven approach
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int choice;

        do {
            System.out.println("\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Search by Name\n5. Search by Position\n6. Update Student\n7. Delete Student\n8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter PRN: ");
                    long prn = scan.nextLong();
                    scan.nextLine();
                    System.out.print("Enter DOB (dd/MM/yyyy): ");
                    Date dob = null;
                    try {
                        dob = sdf.parse(scan.nextLine());
                    } catch (ParseException e) {
                        System.out.println("Invalid date format!");
                        break;
                    }
                    System.out.print("Enter Marks: ");
                    double marks = scan.nextDouble();
                    try {
                        operations.addStudent(new Student(name, prn, dob, marks));
                    } catch (EmptyFieldException | DuplicatePRNException | InvalidMarksException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        operations.displayStudents();
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                    System.out.print("Enter PRN to search: ");
                    long prn = scan.nextLong();
                    try {
                        Student student = operations.searchByPRN(prn);
                        System.out.println("Student Found:\n" + student.display());
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    System.out.print("Enter Name to search: ");
                    String name = scan.nextLine();
                    try {
                        Student student = operations.searchByName(name);
                        System.out.println("Student Found:\n" + student.display());
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> {
                    System.out.print("Enter position to search: ");
                    int position = scan.nextInt();
                    try {
                        Student student = operations.searchByPosition(position);
                        System.out.println("Student Found:\n" + student.display());
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 6 -> {
                    System.out.print("Enter PRN to update: ");
                    long prn = scan.nextLong();
                    scan.nextLine();
                    System.out.print("Enter new name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter new marks: ");
                    double marks = scan.nextDouble();
                    try {
                        operations.updateStudent(prn, name, marks);
                    } catch (StudentNotFoundException | EmptyFieldException | InvalidMarksException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 7 -> {
                    System.out.print("Enter PRN to delete: ");
                    long prn = scan.nextLong();
                    try {
                        operations.deleteStudent(prn);
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 8 -> System.out.println("Exiting program.");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        scan.close();
    }
}