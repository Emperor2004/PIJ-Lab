# **Java Student Management Application**

## 📌 Overview
This project is a **command‑line student management system** implemented in Java. It allows adding, viewing, searching, updating, and deleting student records through a simple text‑based menu interface.

## 🚀 Features
- **Add Student** with validation for empty fields, duplicate PRN, and invalid marks  
- **Display All Students** sorted by PRN  
- **Search Students** by PRN, Name, or Position  
- **Update Student** details (name and marks)  
- **Delete Student** by PRN  
- **Custom Exceptions** for handling error cases:  
  - `EmptyFieldException`  
  - `DuplicatePRNException`  
  - `InvalidMarksException`  
  - `StudentNotFoundException`  
- **Input validation** and **error handling** for invalid inputs and operations  

---

## 📂 Project Structure
```
.
├── DuplicatePRNException.java
├── EmptyFieldException.java
├── InvalidMarksException.java
├── StudentNotFoundException.java
├── Student.java
├── StudentOperations.java
└── Main.java
```


---

## **📌 Class Breakdown**

### **[`DuplicatePRNException.java`](DuplicatePRNException.java)**
Custom exception thrown when attempting to add a student with a PRN that already exists.

---

### **[`EmptyFieldException.java`](EmptyFieldException.java)**
Custom exception thrown when required fields (name or DOB) are empty or null.

---

### **[`InvalidMarksException.java`](InvalidMarksException.java)**
Custom exception thrown when entering negative marks for a student.

---

### **[`StudentNotFoundException.java`](StudentNotFoundException.java)**
Custom exception thrown when a student cannot be found during search, display, update, or delete operations.

---

### **[`Student.java`](Student.java)**
Represents a student with attributes:
- `name` (String)  
- `prn` (long)  
- `dob` (Date)  
- `marks` (double)  
  
Provides constructors, getters/setters, and a `display()` method to format student details as a string.

---

### **[`StudentOperations.java`](StudentOperations.java)**
Handles CRUD operations on an in-memory list of `Student` objects:
- `addStudent(Student)` – Validates inputs, checks for duplicates, adds student, sorts list by PRN  
- `displayStudents()` – Displays all students or throws exception if none exist  
- `searchByPRN(long)` – Finds student by PRN  
- `searchByName(String)` – Finds student by name (case‑insensitive)  
- `searchByPosition(int)` – Finds student by list index  
- `updateStudent(long, String, double)` – Updates student's name and marks  
- `deleteStudent(long)` – Removes student from list

---

### **[`Main.java`](Main.java)**
Driver class providing a menu‑driven interface for user interaction:
- Displays options for all CRUD and search operations  
- Reads and parses user input (name, PRN, DOB, marks, choice)  
- Handles parsing exceptions (`ParseException`) for date inputs  
- Catches and reports custom exceptions for validation and search errors  
- Loops until the user selects **Exit**  

---

## 🔥 Contributor

### 👤 Om Narayan Pandit

#### 📌 PRN: 23070126083
#### 📌 Batch: AIML B1
