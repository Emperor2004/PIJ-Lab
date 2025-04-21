# **Java Multithreading Example**

## 📌 Overview
This project demonstrates **basic multithreading in Java** using custom thread classes. It consists of a main driver that spawns and runs two threads concurrently, each printing its own sequence of messages with controlled delays.


## 🚀 Features
- **Custom Thread Class** extending `Thread`  
- **Concurrent Execution** of multiple threads  
- **Thread Naming** for clear log output  
- **Controlled Delays** using `Thread.sleep(…)` with interruption handling  
- **Simple Console‑based Output** illustrating thread lifecycle  

---

## 📂 Project Structure
```
.
├── MyThread.java
└── Main.java
```


---

## **📌 Class Breakdown**

### **[`MyThread.java`](MyThread.java)**
This class extends Java’s built‑in `Thread` to create threads with custom behavior. It uses a `threadName` field to identify each thread in the console output and overrides `run()` to perform a simple counting task with delays. :contentReference[oaicite:0]{index=0}&#8203;:contentReference[oaicite:1]{index=1}

#### 🔹 Functionalities:
- Accepts a **thread name** via constructor  
- Prints a **start** message (`threadName + " started running."`)  
- Iterates from **1 to 5**, printing each count (`threadName + ": " + i`)  
- Sleeps for **500 ms** between counts, handling `InterruptedException`  
- Prints a **finish** message (`threadName + " finished."`)  

---

### **[`Main.java`](Main.java)**
Driver class containing the `main` method that initializes and starts multiple `MyThread` instances. It demonstrates how to launch separate threads and shows the interleaved output of concurrent execution. :contentReference[oaicite:2]{index=2}&#8203;:contentReference[oaicite:3]{index=3}

#### 🔹 Functionalities:
- Prints **“Main thread started.”** at the beginning and **“Main thread ended.”** at the end  
- **Creates** two `MyThread` objects (`Thread-1`, `Thread-2`)  
- **Starts** both threads with `thread.start()` to run them concurrently  
- Relies on the JVM scheduler to interleave thread outputs  

---

## 🔥 Contributor

### 👤 Om Narayan Pandit

#### 📌 PRN: 23070126083
#### 📌 Batch: AIML B1
