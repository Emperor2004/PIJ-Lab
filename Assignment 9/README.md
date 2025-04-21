# **Student Data Entry Application with MySQL JDBC**

## 📌 Overview
This project is a **command‑line student management system** implemented in Java. It connects to a MySQL database to perform CRUD (Create, Read, Update, Delete) operations on student records through a simple text‑based menu interface.
## 🚀 Features
- **Automatic Table Creation**: Creates `students` table if it doesn’t already exist  
- **Add Student** – Insert new student records into the database  
- **Display All Students** – Retrieve and list all students  
- **Search Student by PRN** – Look up a specific student using their PRN  
- **Update Student** – Modify name and batch for an existing student  
- **Delete Student** – Remove a student from the database by PRN  
- **Input Validation & Error Handling** for invalid menu choices, number parsing, duplicate PRNs, and SQL exceptions  

---

## 📂 Project Structure
```
.
├── DBConnection.java
├── Student.java
├── StudentOperations.java
└── Main.java
```


---

## **📌 Class Breakdown**

### **[`DBConnection.java`](DBConnection.java)**
Handles database connectivity.

#### 🔹 Functionalities:
- Defines JDBC **URL**, **USER**, and **PASSWORD**  
- Loads MySQL JDBC driver (`com.mysql.cj.jdbc.Driver`)  
- Provides a static `getConnection()` method returning a `Connection` object  

---

### **[`Student.java`](Student.java)**
Represents the student entity.

#### 🔹 Functionalities:
- Fields: `name` (String), `prn` (int), `batch` (String)  
- Constructor to initialize all fields  
- Getters and setters for each field  
- `toString()` override for formatted output  

---

### **[`StudentOperations.java`](StudentOperations.java)**
Implements all CRUD operations on the `students` table.

#### 🔹 Functionalities:
- **Constructor**: Calls `createTableIfNotExists()`  
- `createTableIfNotExists()` – Creates `students` table with `id`, `name`, `prn` (unique), and `batch`  
- `addStudent(Student student)` – Inserts a new student  
- `displayAllStudents()` – Queries and prints all student records  
- `searchStudent(int prn)` – Looks up a student by PRN  
- `updateStudent(int prn, String newName, String newBatch)` – Updates name and batch  
- `deleteStudent(int prn)` – Deletes the student record

---

### **[`Main.java`](Main.java)**
Driver class handling user interaction.

#### 🔹 Functionalities:
- Displays menu for **Add**, **Display**, **Search**, **Update**, **Delete**, and **Exit**  
- Reads and validates user input via `Scanner`  
- Instantiates `StudentOperations` and calls appropriate methods  
- Gracefully handles `NumberFormatException` for invalid numeric input  

---

## 🔥 Contributor

### 👤 Om Narayan Pandit

#### 📌 PRN: 23070126083
#### 📌 Batch: AIML B1
