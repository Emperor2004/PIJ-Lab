//StudentOperations.java //Perform CRUD

import java.util.*;
class StudentOperations{
	ArrayList<Student> students; //  Student refers to file Student.java
	
	public StudentOperations(){
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student){
		students.add(student);
		System.out.println("Student Added.");
	}

	public void displayStudents(){
		for (Student student : students){
			student.display();
		}
	}
}