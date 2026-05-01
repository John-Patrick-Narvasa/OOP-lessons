

### **What is an Exception?**

An **exception** is an event that occurs during program execution that disrupts the normal flow of instructions. When an error occurs within a method, the method creates an object called an **exception object** and hands it off to the runtime system.

### **Real-Life Analogy**

Think of driving a car. Normally, you drive smoothly from point A to point B. But sometimes, unexpected events occur: a flat tire, running out of gas, or a road closure. These are like *exceptions* - they interrupt your normal journey. You need to *handle* these situations: change the tire, refuel, or take a detour.

### **Why Exception Handling?**

* **Program Stability: **Prevent program crashes
* **Error Recovery: **Attempt to recover from errors
* **User-Friendly: **Provide meaningful error messages
* **Debugging: **Help identify and fix issues
* **Separation of Concerns: **Separate error-handling code from regular code



## **Exception Hierarchy**

### **2.1 The Exception Class Hierarchy**

All exceptions in Java inherit from the **Throwable** class. The hierarchy has two main branches:

![1777562323721](image/exception_hierarchy/1777562323721.png)



## **Checked vs Unchecked Exceptions**

### **Checked Exceptions**

**Checked exceptions** are exceptions that are  **checked at compile-time** . The compiler forces you to either handle them (using try-catch) or declare them (using throws).

**Common Checked Exceptions:**

* **IOException: **Input/output operations failed
* **FileNotFoundException: **File not found
* **SQLException: **Database access error
* **ClassNotFoundException: **Class not found
