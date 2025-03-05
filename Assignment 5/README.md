# Shape Calculation Java Program

## 📌 Overview

This is a **menu-driven Java program** that demonstrates the concepts of **Abstract Classes, Interfaces, and Object-Oriented Programming (OOP)**. The program allows users to calculate the **area, perimeter, and volume** of different geometric shapes.

## 🚀 Features

- Calculate **Area** and **Perimeter** for:
  - Circle
  - Rectangle
  - Square
  - Sphere
  - Cylinder
  - Equilateral Pyramid
- Calculate **Volume** for:
  - Sphere
  - Cylinder
  - Equilateral Pyramid
- Implements **abstract classes** and **interfaces**.
- **Menu-driven system** for user interaction.

---

## 📂 Project Structure & Functionalities

### 📌 [`Shape.java`](Shape.java)

This is an **abstract base class** for all shapes.

#### 🔹 Functionalities:

- Defines protected variables for **dimensions**.
- Implements **abstract methods**:
  - `calculateArea()` - Calculates and returns the area.
  - `calculatePerimeter()` - Calculates and returns the perimeter.

---

### 📌 [`Volume.java`](Volume.java)

This is an **interface** for 3D shapes that have volume.

#### 🔹 Functionalities:

- Contains an abstract method:
  - `calculateVolume()` - Calculates and returns the volume.

---

### 📌 [`Circle.java`](Circle.java)

Represents a **Circle**, extending `Shape`.

#### 🔹 Functionalities:

- Implements:
  - `calculateArea()` → Uses formula **πr²**
  - `calculatePerimeter()` → Uses formula **2πr**

---

### 📌 [`Rectangle.java`](Rectangle.java)

Represents a **Rectangle**, extending `Shape`.

#### 🔹 Functionalities:

- Implements:
  - `calculateArea()` → Uses formula **length × width**
  - `calculatePerimeter()` → Uses formula **2(length + width)**

---

### 📌 [`Square.java`](Square.java)

Represents a **Square**, extending `Shape`.

#### 🔹 Functionalities:

- Implements:
  - `calculateArea()` → Uses formula **side²**
  - `calculatePerimeter()` → Uses formula **4 × side**

---

### 📌 [`Sphere.java`](Sphere.java)

Represents a **Sphere**, extending `Shape` and implementing `Volume`.

#### 🔹 Functionalities:

- Implements:
  - `calculateArea()` → Uses formula **4πr²**
  - `calculateVolume()` → Uses formula **(4/3)πr³**

---

### 📌 [`Cylinder.java`](Cylinder.java)

Represents a **Cylinder**, extending `Shape` and implementing `Volume`.

#### 🔹 Functionalities:

- Implements:
  - `calculateArea()` → Uses formula **2πr(h + r)**
  - `calculateVolume()` → Uses formula **πr²h**

---

### 📌 [`EquilateralPyramid.java`](EquilateralPyramid.java)

Represents an **Equilateral Pyramid**, extending `Shape` and implementing `Volume`.

#### 🔹 Functionalities:

- Implements:
  - `calculateArea()` → Uses formula **Base Area + Lateral Area**
  - `calculateVolume()` → Uses formula **(1/3) × base² × height**

---

### 📌 [`Main.java`](Main.java)

This is the **entry point** of the program, responsible for **user interaction** through a menu-driven system.

#### 🔹 Functionalities:

- Displays a **menu** for selecting a shape.
- Takes **user input** for dimensions.
- Calls the appropriate methods to calculate **area, perimeter, and volume**.
- Uses **instanceof** to check if a shape implements `Volume` before calculating volume.

---
