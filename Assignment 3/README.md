# Student Management System (Java)

## 📌 Overview
This is a **menu-driven Java program** that demonstrates the concepts of **classes, arrays (ArrayList), instance members, and constructors**. It allows users to **add, display, search, update, and delete students** based on various criteria.

## 🚀 Features
- Add a student (with **PRN, Name, DOB, Marks**)
- Display all students (**sorted by PRN** automatically)
- Search a student by **PRN, Name, or Position**
- Update a student's **Name and Marks**
- Delete a student by **PRN**
- Handles **invalid inputs and errors** gracefully

## 📂 Project Structure & Functionalities

### 📌 [`Student.java`](Student.java)
This class represents a **student entity** with the following attributes:
- `PRN` (Permanent Registration Number)
- `Name`
- `DOB` (Date of Birth)
- `Marks`

#### 🔹 Functionalities:
- **Getter and Setter methods** for each attribute.
- **Display method** to print student details in a formatted manner.

---

### 📌 [`StudentOperations.java`](StudentOperations.java)
This class **manages the student records** using an `ArrayList<Student>`. It handles all CRUD operations.

#### 🔹 Functionalities:
- **`addStudent(Student student)`**: Adds a student to the list and ensures sorting by PRN.
- **`displayStudents()`**: Displays all students in sorted order.
- **`searchByPRN(long prn)`**: Searches for a student by PRN.
- **`searchByName(String name)`**: Searches for a student by Name.
- **`searchByPosition(int position)`**: Retrieves a student based on their position in the list.
- **`updateStudent(long prn, String newName, double newMarks)`**: Updates a student’s **Name and Marks**.
- **`deleteStudent(long prn)`**: Deletes a student by PRN.

---

### 📌 [`Main.java`](Main.java)
This is the **entry point** of the program, responsible for **user interaction** through a menu-driven system.

#### 🔹 Functionalities:
- Presents a **menu** with options for all student management operations.
- Takes **user input** and calls the appropriate functions from `StudentOperations`.
- Implements **error handling** for invalid inputs and exceptions.



## 🛑 Error Handling

- Invalid PRN, Name, or Position searches return: `Student not found`.

- Invalid Date Format returns: `Invalid date format!`

- Ensures PRN uniqueness and maintains sorted order
