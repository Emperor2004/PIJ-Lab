// Class for handling student operations (CRUD)

import java.util.ArrayList;
import java.util.Comparator;

class StudentOperations {
    private ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    // Adds a student, validating fields and checking duplicate PRN
    public void addStudent(Student student) throws EmptyFieldException, DuplicatePRNException, InvalidMarksException {
        if (student.getName() == null || student.getName().trim().isEmpty() || student.getDOB() == null) {
            throw new EmptyFieldException("Name and DOB cannot be empty.");
        }
        if (student.getMarks() < 0) {
            throw new InvalidMarksException("Marks cannot be negative.");
        }
        // Check for duplicate PRN
        boolean exists = students.stream()
                                 .anyMatch(s -> s.getPRN() == student.getPRN());
        if (exists) {
            throw new DuplicatePRNException("Student with PRN " + student.getPRN() + " already exists.");
        }

        students.add(student);
        students.sort(Comparator.comparingLong(Student::getPRN)); // Sort by PRN
        System.out.println("Student added successfully.");
    }

    // Displays all students or throws if none exist
    public void displayStudents() throws StudentNotFoundException {
        if (students.isEmpty()) {
            throw new StudentNotFoundException("No students to display.");
        }
        for (Student student : students) {
            System.out.println(student.display());
        }
    }

    // Search by PRN
    public Student searchByPRN(long prn) throws StudentNotFoundException {
        return students.stream()
                       .filter(s -> s.getPRN() == prn)
                       .findFirst()
                       .orElseThrow(() -> new StudentNotFoundException(
                           "Student with PRN " + prn + " not found."));
    }

    // Search by Name
    public Student searchByName(String name) throws StudentNotFoundException {
        return students.stream()
                       .filter(s -> s.getName().equalsIgnoreCase(name))
                       .findFirst()
                       .orElseThrow(() -> new StudentNotFoundException(
                           "Student with name '" + name + "' not found."));
    }

    // Search by Position (0-based index)
    public Student searchByPosition(int position) throws StudentNotFoundException {
        if (position < 0 || position >= students.size()) {
            throw new StudentNotFoundException("No student at position " + position + ".");
        }
        return students.get(position);
    }

    // Update student details
    public void updateStudent(long prn, String newName, double newMarks)
            throws StudentNotFoundException, EmptyFieldException, InvalidMarksException {
        Student student = searchByPRN(prn);
        if (newName == null || newName.trim().isEmpty()) {
            throw new EmptyFieldException("Name cannot be empty.");
        }
        if (newMarks < 0) {
            throw new InvalidMarksException("Marks cannot be negative.");
        }
        student.setName(newName);
        student.setMarks(newMarks);
        System.out.println("Student updated successfully.");
    }

    // Delete student
    public void deleteStudent(long prn) throws StudentNotFoundException {
        Student student = searchByPRN(prn);
        students.remove(student);
        System.out.println("Student removed successfully.");
    }
}