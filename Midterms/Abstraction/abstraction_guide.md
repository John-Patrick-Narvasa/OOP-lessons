# Lesson 5: Abstract and Interface

#### Learning Objectives

By the end of this module, you will be able to:

* Understand the concept of abstraction in Java
* Create and use abstract classes effectively
* Define and implement interfaces in Java
* Understand the difference between abstract classes and interfaces
* Implement multiple interfaces in a single class
* Use interface default and static methods
* Design flexible systems using abstraction

### **What is Abstraction?**

**Abstraction** is the process of hiding implementation details and showing only the essential features of an object. It allows you to focus on *what* an object does rather than *how* it does it.

Think of abstraction as a contract that defines **what methods must exist** without specifying  **how they should work** .

### **Real-Life Analogy**

Consider a  **car** . You know it has methods like *start(), accelerate(), brake(),* and  *stop()* . You don't need to know *how* the engine works internally - you just use the interface (steering wheel, pedals, gear shift) to interact with it.

Another example: When you use a  **TV remote** , you press buttons without knowing the internal circuitry. The remote provides an *abstraction* - you know what each button does, not how it does it.

![](https://cdn.gamma.app/s1jl3a40l6g7l02/a1f290c3409846c6812e793f7b6aece3/original/image.png)Image taken from geeksforgeeks

### **Why Use Abstraction?**

**• Reduces Complexity: **Hide complex implementation details

**• Increases Reusability: **Define common behavior in abstract classes

**• Provides Flexibility: **Change implementation without affecting users

**• Enforces Standards: **Ensure subclasses implement required methods

**• Supports Multiple Implementations: **Same interface, different behaviors

### **Abstraction in Java**

Java provides two ways to achieve abstraction:

| **Method**         | **Abstraction Level** | **Usage**     |
| ------------------------ | --------------------------- | ------------------- |
| **Abstract Class** | 0-100% abstract             | Partial abstraction |
| **Interface**      | 100% abstract               | Full abstraction    |

# Let's start programing…….

### **What is Abstraction in Object-Oriented Programming Again?**

Abstraction in object-oriented programming (OOP) is an integral component that allows developers to streamline complex systems while keeping focus on essential details. Abstraction involves extracting relevant data while hiding irrelevant implementation details.

Abstraction allows developers to build models of real-world objects, systems or processes by abstracting away complexity while only exposing essential characteristics. This helps create more manageable and understandable code in turn.

### **Abstract Classes**

### ** What is an Abstract Class?**

An **abstract class** is a class that **cannot be instantiated** (you cannot create objects from it). It serves as a blueprint for other classes and can contain both abstract and concrete methods.

### **Key Characteristics**

• Declared using the **abstract** keyword

• Cannot be instantiated directly

• Can have both abstract and concrete methods

• Can have constructors, fields, and static methods

• Abstract methods have no body (no implementation)

• Child classes must implement all abstract methods

### **Basic Example: Shape Hierarchy**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/f9b6602a347c4305a220879ba8d7984d/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/5cd1f3f0dd7f4f66aaa45c67e52994b6/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/e08298c6ebdb488c8b46b4d50a038f00/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/52bd85b585884149b77f4d57c3464178/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/36b2fe2d5b4a4e0199fa58468439a428/original/image.png)## **Interfaces**

### **What is an Interface?**

An **interface** is a completely abstract blueprint that defines a contract for what methods a class must implement. It specifies *what* a class must do, but not *how* it should do it.

### **Key Characteristics**

• Declared using the **interface** keyword

• All methods are implicitly public and abstract (before Java 8)

• All fields are implicitly public, static, and final (constants)

• A class can implement multiple interfaces

• Cannot be instantiated

• Can extend other interfaces

### **Basic Example: Drawable Interface**

![img](https://cdn.gamma.app/s1jl3a40l6g7l02/417aeb1256b84cfba58825fbbfbbc6dc/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/9d3e470a5131474397e4a5d76d65d5fc/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/2403ff0bcef849d09a77eb476fbdfccf/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/c996cce326b947f8898095f7530312fe/original/image.png)
