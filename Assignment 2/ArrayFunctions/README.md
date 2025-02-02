# Array Functions

## Overview
This assignment consists of three Java files that work together to process and manipulate arrays and ArrayLists. The program allows users to input an array, perform various operations on it, and interact with a menu-driven interface.

### Files in this Assignment:
1. [UserInput.java](UserInput.java) – Handles user input for arrays.
2. [ArrayFunctions.java](ArrayFunctions.java) – Provides utility functions for processing arrays and ArrayLists.
3. [Main.java](Main.java) – The main program that drives user interaction.

---

## File Descriptions

### 1. UserInput
This class is responsible for taking user input and storing it in an integer array.  
**Functionality:**
- Prompts the user to enter 5 numbers.
- Stores user input in an array.
- Returns the array for further processing.

---

### 2. ArrayFunctions
This class provides various utility functions for handling arrays and ArrayLists.  
**Functionality:**
- **Displaying Data**:
  - Displays an array.
  - Displays an ArrayList.
- **Processing Data**:
  - Separates and displays even and odd numbers from the array.
  - Computes and displays the difference between consecutive elements in an array.
- **Conversion Functions**:
  - Converts an `ArrayList<Integer>` to an array and displays it.
  - Converts an integer array to an `ArrayList<Integer>` and displays it.

---

### 3. Main
This is the entry point of the program, providing a menu-driven interface for users to interact with array functions.  
**Functionality:**
- Reads an integer array from user input.
- Displays a menu with the following options:
  1. Show even and odd numbers.
  2. Show differences between adjacent elements.
  3. Convert between arrays and ArrayLists.
  4. Display the array.
- Executes user-selected operations using `ArrayFunctions`.

---
