// Class for handling student operations (CRUD)

import java.util.*;

class StudentOperations {
    private ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }

    public Student searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                return student;
            }
        }
        return null;
    }

    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(long prn, String newName) {
        Student student = searchByPRN(prn);
        if (student != null) {
            student.setName(newName);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(long prn) {
        Student student = searchByPRN(prn);
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
