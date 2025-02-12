// Main.java

import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = scan.nextLine();
		System.out.println("Enter PRN: ");
		long prn = Long.parseLong(scan.nextLine());
		
		StudentOperations operations = new StudentOperations();
		Student student = new Student(name, prn);
		operations.addStudent(student);
		operations.displayStudents();
	}
}