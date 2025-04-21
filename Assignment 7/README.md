# **Java Calculator Application**

## 📌 Overview
This project is a **command‑line calculator** implemented in Java. It provides basic arithmetic, exponentiation, and root operations through a simple text‑based menu interface.

## 🚀 Features
- **Addition**, **Subtraction**, **Multiplication**, **Division**  
- **Square** and **Cube** operations  
- **Square Root** calculation  
- **Input validation** and **error handling** for invalid choices, divide‑by‑zero, and negative square‑root inputs  
- **Separation of concerns**: calculations in a `Calculator` utility class, user interaction in `Main`  
- **Extensible design** for adding new operations

---

## 📂 Project Structure
```
.
├── Calculator.java
└── Main.java
```


---

## **📌 Class Breakdown**

### **[`Calculator.java`](Calculator.java)**
This is an **abstract base class** for all ducks.

#### 🔹 Functionalities:
- `add(double a, double b)` – Returns the sum of `a` and `b`  
- `subtract(double a, double b)` – Returns `a` minus `b`  
- `multiply(double a, double b)` – Returns the product of `a` and `b`  
- `divide(double a, double b)` – Returns `a ÷ b`; throws `ArithmeticException` on zero divisor  
- `square(double a)` – Returns `a²`  
- `cube(double a)` – Returns `a³`  
- `squareRoot(double a)` – Returns √a; throws `ArithmeticException` for negative `a`

---

### **[`Main.java`](Main.java)**
Driver class handling user interaction via console.

#### 🔹 Functionalities:
- Displays a menu of operations and reads user choice  
- Prompts for one or two operands as needed  
- Catches and reports `InputMismatchException` and `ArithmeticException`  
- Calls `Calculator` methods to compute results  
- Loops until the user selects **Exit**

---

## 🔥 Contributor

### 👤 Om Narayan Pandit

#### 📌 PRN: 23070126083
#### 📌 Batch: AIML B1
