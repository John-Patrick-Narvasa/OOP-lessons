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

***Example:***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/fda8e4d0282f44158e77d89a815bfdb1/original/image.png)***Important: ****If you don't handle checked exceptions, your code will not compile! The compiler will give you an error.*

### **Unchecked Exceptions**

**Unchecked exceptions** (also called  *runtime exceptions* ) are exceptions that are  **not checked at compile-time** . They occur during program execution and usually indicate programming errors.

**Common Unchecked Exceptions:**

* **NullPointerException: **Accessing null reference
* **ArithmeticException: **Arithmetic error (e.g., divide by zero)
* **ArrayIndexOutOfBoundsException: **Array index invalid
* **NumberFormatException: **String to number conversion failed
* **IllegalArgumentException: **Invalid argument passed

***Example:***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/56bd9966f35c4735b6a044d5368c23da/original/image.png)

### **Comparison Table**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/d3ee80cbede940e6a07a98d2d92e84d5/original/image.png)

### **Throwing Exceptions**

### **a. **The throw Keyword

You can manually **throw** an exception using the **throw** keyword. This is useful when you want to signal that an error condition has occurred.

**Syntax:**

throw new ExceptionType("Error message");

***Example:***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/71d82b657d6a47dcbb886659664134ed/original/image.png)

### **b. The throws Keyword**

The **throws** keyword is used in method signatures to declare that a method might throw certain exceptions. The caller must handle these exceptions.

***Example:***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/aaa5b9c0a6874c13b5dd22410c8492c5/original/image.png)***Difference: throw ****is used to actually throw an exception, while ****throws ****is used to declare that a method might throw an exception.*

## **Exception Propagation**

### **What is Exception Propagation?**

**Exception propagation** is the process by which an exception is passed up the call stack from the method where it occurred to the calling method, until it is either caught or reaches the main method.

### **How It Works**

When an exception occurs:

1. Java looks for a catch block in the current method
2. If not found, the exception is thrown to the calling method
3. This continues up the call stack
4. If no handler is found, the program terminates

***Example:***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/11a682cac8224575a1fa612d419588e9/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/864661abcf3e45e380d686a526abe478/original/image.png)

***Call Stack: ****method3() → method2() → method1(). The exception bubbles up until it's caught in method1().*

## **User-Defined Exceptions**

### **Why Create Custom Exceptions?**

* To represent specific error conditions in your application
* To provide more meaningful error messages
* To categorize exceptions specific to your business logic
* To add custom fields and methods

### **Creating Custom Checked Exception**

***InsufficientFundsException.java***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/29b76c0498934eaeb446959155126990/original/image.png)***BankAccount.java***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/2d2915865cad4ecaaad44d21e6086fc1/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/0a86702db0bd45de8631358402dfe30e/original/image.png)

### **Creating Custom Unchecked Exception**

***InvalidAgeException.java***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/a78f151b074f465c97391e226b6f625a/original/image.png)***Usage Example:***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/78f2a67aad32480b8f53bb5f2445212a/original/image.png)### ** Exception Hierarchy Best Practices**

Create a hierarchy of custom exceptions for better organization:

![](https://cdn.gamma.app/s1jl3a40l6g7l02/15ba2dd0c3284c0f9e3d3c169345aa40/original/image.png)***Benefit: ****You can catch all bank-related exceptions with catch(BankException e) or handle specific ones individually.*

## ** Multiple Catch Blocks and Try-with-Resources**

### **Multiple Catch Blocks**

You can have multiple catch blocks to handle different types of exceptions differently.

![](https://cdn.gamma.app/s1jl3a40l6g7l02/328a4bd3625449aabb99f1f75a3e49b3/original/image.png)

***Important: ****Catch blocks must be ordered from most specific to most general. The more specific exception must come first!*

### **Try-with-Resources**

Introduced in Java 7, **try-with-resources** automatically closes resources (like files) when the try block finishes, even if an exception occurs.

***Old Way (without try-with-resources):***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/147ed21dbd0e42aea40f98338ab43814/original/image.png)

***New Way (with try-with-resources):***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/6ae4082446ca403ca246e1a96ee5a8e6/original/image.png)

***Benefit: ****Cleaner code, automatic resource management, prevents resource leaks.*
