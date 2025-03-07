# **Shape Calculation Java Program**

## 📌 Overview

This is a **menu-driven Java program** that demonstrates the concepts of **Abstract Classes, Interfaces, and Object-Oriented Programming (OOP)**. The program allows users to calculate the **area, perimeter, and volume** of different geometric shapes.

## 🚀 Features

- Calculate **Area** and **Perimeter** for:
  - Circle
  - Rectangle
  - Square
  - Sphere
  - Cylinder
  - Equilateral Pyramid (Square Base)
- Calculate **Volume** for:
  - Sphere
  - Cylinder
  - Equilateral Pyramid (Square Base)
- Implements **abstract classes** and **interfaces**.
- **Menu-driven system** for user interaction.

---

## 📂 Project Structure


```
.
├── Shape.java
├── Volume.java
├── Circle.java
├── Rectangle.java
├── Square.java
├── Sphere.java
├── Cylinder.java
├── EquilateralPyramid.java
└── Main.java
```

---

## **📌 Class Breakdown**


### **[`Shape.java`](Shape.java)**
This is an **abstract base class** for all shapes.

#### 🔹 Functionalities:
- Defines protected variables for **dimensions**.
- Implements **abstract methods**:
  - `calculateArea()` - Calculates and returns the area.
  - `calculatePerimeter()` - Calculates and returns the perimeter.

---

### **[`Volume.java`](Volume.java)**
This is an **interface** for 3D shapes that have volume.

#### 🔹 Functionalities:
- Contains an abstract method:
  - `calculateVolume()` - Calculates and returns the volume.

---

### **[`Circle.java`](Circle.java)**
Represents a **Circle**, extending `Shape`.

#### 🔹 Functionalities:
- Implements:
  - `calculateArea()` → Uses formula:  
    **A = πr²**
    
    where:  
    - \( r \) = radius of the circle  

  - `calculatePerimeter()` → Uses formula:  
    **P = 2πr**


---

### **[`Rectangle.java`](Rectangle.java)**
Represents a **Rectangle**, extending `Shape`.

#### 🔹 Functionalities:
- Implements:
  - `calculateArea()` → Uses formula:  
    **A = l × w**
  
    where:  
    - \( l \) = length  
    - \( w \) = width  

  - `calculatePerimeter()` → Uses formula:  
    **P = 2(l + w)**
  

---

### **[`Square.java`](Square.java)**
Represents a **Square**, extending `Shape`.

#### 🔹 Functionalities:
- Implements:
  - `calculateArea()` → Uses formula:  
    **A = s²**
  
    where:  
    - \( s \) = side length  

  - `calculatePerimeter()` → Uses formula:  
    **P = 4s**
  

---

### **[`Sphere.java`](Sphere.java)**
Represents a **Sphere**, extending `Shape` and implementing `Volume`.

#### 🔹 Functionalities:
- Implements:
  - `calculateArea()` → Uses formula:  
    **A = 4πr²**
  
    where:  
    - \( r \) = radius of the sphere  

  - `calculateVolume()` → Uses formula:  
    **V = (4/3) π r³**


---

### **[`Cylinder.java`](Cylinder.java)**
Represents a **Cylinder**, extending `Shape` and implementing `Volume`.

#### 🔹 Functionalities:
- Implements:
  - `calculateArea()` → Uses formula:  
    **A = 2πr (r + h)**
  
    where:  
    - \( r \) = radius  
    - \( h \) = height  

  - `calculatePerimeter()` → Uses formula:  
    **P = 4πr**
  

  - `calculateVolume()` → Uses formula:  
    **V = πr²h**
  

---

### **[`EquilateralPyramid.java`](EquilateralPyramid.java)**
Represents an **Equilateral Pyramid (Square Base)**, extending `Shape` and implementing `Volume`.

#### 🔹 Functionalities:
- Implements:
  - `calculateArea()` → Uses formula:  
    **A_total = (1 + √3) × s²**
  
    where:  
    - \( s \) = side length of the square base  

  - `calculatePerimeter()` → Uses formula:  
    **P = 4s**
  

  - `calculateVolume()` → Uses formula:  
    **V = (1/3) × s² × h**
  
    where:  
    - \( s \) = side length of the square base  
    - \( h \) = height of the pyramid  

---

### **[`Main.java`](Main.java)**
This is the **entry point** of the program, responsible for **user interaction** through a menu-driven system.

#### 🔹 Functionalities:
- Displays a **menu** for selecting a shape.
- Takes **user input** for dimensions.
- Calls the appropriate methods to calculate **area, perimeter, and volume**.
- Uses **instanceof** to check if a shape implements `Volume` before calculating volume.

---

## 🔗 Contributor

### 👤 Om Narayan Pandit  
📌 **PRN:** 23070126083  
📌 **Batch:** AIML B1  
