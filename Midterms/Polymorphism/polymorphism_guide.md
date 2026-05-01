# Lesson 4: **Polymorphism**

**Learning Objectives**

By the end of this module, you will be able to:

* Understand the concept of polymorphism in Java
* Distinguish between compile-time and runtime polymorphism
* Implement method overloading (compile-time polymorphism)
* Implement method overriding (runtime polymorphism)
* Use polymorphic references and dynamic method dispatch
* Apply the instanceof operator effectively
* Design and implement polymorphic systems

### **What is Polymorphism?**

The word **polymorphism** comes from Greek words: *poly* (many) and *morph* (form). In programming, polymorphism means **"the ability of an object to take on many forms."**

Polymorphism allows us to perform a single action in different ways. It provides a way to use a class exactly like its parent, while keeping the unique implementation of each child class.

### **Real-Life Analogy**

Think about a  **smartphone** . You can perform the action "take a picture" on different phones (iPhone, Samsung, Google Pixel), but each phone implements this action differently. The interface is the same (press the camera button), but the *behavior* varies based on the specific phone model.

Another example: A **Person** can be a Student, a Teacher, or an Employee. They're all persons, but each behaves differently when asked to "work" - students study, teachers teach, employees perform job duties.

Types of Polymorphism Polymorphism in Java is mainly of 2 types as mentioned below:

1. **Compile-time Polymorphism(Method Overloading)** :Achieved when multiple methods have the same name but different parameters. The method call is resolved at compile time.
2. **Runtime Polymorphism (Method Overriding )** : Achieved when a subclass provides a specific implementation of a method already defined in its superclass. The method call is resolved at runtime based on the object

#### **Casting in Polymorphism**

* **Upcasting** : This involves casting an object to one of its superclass types. Being an implicit conversion, it's safe.

```java
Dog myDog = new Dog();
Animal myAnimal = myDog;  // Upcasting
```

* **Downcasting** : Here, we cast an object to one of its subclass types. It must be done explicitly due to potential risks.

```java
Animal myAnimal = new Dog();
Dog myDog = (Dog) myAnimal;  // Downcasting
```

NOTE: It's important to be cautious and make sure you do this correctly, as forced incorrect downcasting can lead to errors.

#### **The Utility of the **`instanceof`** Operator**

The `instanceof` operator is integral for type verification, often used before downcasting to prevent unwarranted `ClassCastException`.

```java
if (myAnimal instanceof Dog) {
   Dog myDog = (Dog) myAnimal;
```

By confirming type beforehand, we establish a safe environment for typecasting.

### **Benefits of Polymorphism**

* **Code Reusability: **Write general code that works with parent class types
* **Flexibility: **Objects can be treated as instances of their parent class
* **Extensibility: **Add new classes without changing existing code
* **Maintainability: **Easier to update and maintain code

Reference/s:

[Learn Java Fundamentals – Object-Oriented Programming [Full Book] - freeCodeCamp.org]()

# Let's start programing…….

![](https://cdn.gamma.app/s1jl3a40l6g7l02/ca5ef91f253f47d7948612abe73ac453/original/image.png)

## **1. Compile-Time Polymorphism: Method Overloading**

### **What is Method Overloading?**

**Method overloading** allows a class to have multiple methods with the **same name** but  **different parameters** . The compiler determines which method to call based on the method signature.

### **Rules for Overloading**

* Methods must have the same name
* Methods must have different parameter lists (different number, types, or order)
* Return type alone is NOT sufficient to overload
* Can have different access modifiers

### **Example: Calculator Class**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/e5ef8993a2864054ba5cd22a338098ef/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/e7a9e74f2a274953a8996e79fe3f6a90/original/image.png)***Notice: ****The same method name 'add' is used, but Java knows which version to call based on the arguments you provide. This decision is made at compile time.*

## **2. Runtime Polymorphism: Method Overriding**

### **What is Method Overriding?**

**Method overriding** occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The method in the subclass has the **same signature** as the method in the parent class.

This is the foundation of **runtime polymorphism** - the decision about which method to execute is made at *runtime* based on the  **actual object type** , not the reference type.

### **Example: Animal Hierarchy**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/707d62b80a0e4f87955cf4050cbac677/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/ab056fd7a97d4f0ebb7077dfe7e50cd9/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/1dd810ec84b7493ea54f8875cf26e4af/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/5b5ddba44ac344378d93945637142e47/original/image.png)

**Now, Let's write the Main Class to demonstrate the Polymorphic Behavior:**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/c57c5a4fd3fa4a70bf79f6db5d8b7a16/original/image.png)

![img](https://cdn.gamma.app/s1jl3a40l6g7l02/b1fdc5b8d26e47e0a94da8da14f4b485/original/image.png)***Key Point: ****Even though all variables are declared as Animal type, the actual method called depends on the REAL object type (Dog, Cat, or Bird). This is runtime polymorphism!*
