# Lesson 2: Encapsulation

**Learning Objectives**

By the end of this module, you will be able to:

* Understand and apply the principle of encapsulation in object-oriented programming
* Implement accessor (getter) and mutator (setter) methods effectively
* Design classes with proper data hiding and validation
* Create and interpret UML diagrams - sequence and object
* Draw sequence diagrams to model object interactions
* Utilize object diagrams to represent system states

### **What is Encapsulation?**

Encapsulation is one of the four fundamental principles of Object-Oriented Programming (OOP). It refers to the bundling of data (attributes) and methods that operate on that data within a single unit (class), while restricting direct access to some of the object's components.

![](https://cdn.gamma.app/s1jl3a40l6g7l02/f03f907b0c5d4ea6b79d94c32e5c7e08/original/image.png)

### **Why Use Encapsulation?**

* **Data Protection: **Prevents unauthorized or invalid modifications to object data
* **Modularity: **Changes to internal implementation don't affect code that uses the class
* **Flexibility: **Internal representation can be changed without affecting external code
* **Validation: **Control how data is accessed and modified through validation logic

### **The Encapsulation Process**

1. Declare class attributes as **private**
2. Provide **public getter methods** (accessors) to read attribute values
3. Provide **public setter methods** (mutators) to modify attribute values with validation

## Review: Constructors, Accessors & Mutators!!

### **What is a Constructor?**

A constructor is a special method that is called automatically when an object is created. It initializes the object's attributes with starting values.

### **Constructor Characteristics**

* Has the same name as the class
* Has no return type (not even void)
* Can be overloaded (multiple constructors with different parameters)
* If no constructor is defined, Java provides a default no-argument constructor

### **Types of Constructors**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/2a5e466920a44b259886db661d7321eb/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/5a500362600f42718b9a7c726588a378/original/image.png)## **Accessors and Mutators**

### **Accessor Methods (Getters)**

Accessor methods, commonly called  **getters** , are public methods that return the value of a private attribute. They provide read-only access to the data.

**Naming Convention:**

* Method name starts with 'get' followed by the attribute name
* For boolean attributes, use 'is' instead of 'get' (e.g., isActive())
* Return type matches the attribute type

![](https://cdn.gamma.app/s1jl3a40l6g7l02/de92a87c6e7748878a6f50b9ba095d4e/original/image.png)

### **Mutator Methods (Setters)**

Mutator methods, commonly called  **setters** , are public methods that modify the value of a private attribute. They allow controlled write access to the data with validation.

**Naming Convention:**

* Method name starts with 'set' followed by the attribute name
* Takes one parameter of the same type as the attribute
* Return type is void (typically)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/c386862d479b4c6db10d35c89c7ca0ec/original/image.png)

# Let's start programing…….

### **The Three Simple Rules of Encapsulation**

1. **Hide your data ** - Make all your variables private
2. **Provide a way to see the data ** - Create getter methods (public)
3. **Provide a way to change the data ** - Create setter methods (public) with validation

## **Example 1: Simple Bank Account**

### **Without Encapsulation (Bad Way ** **❌****)**

**Let's see what happens when we DON'T use encapsulation:**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/6f437704edc34d0487b5bb6b4b239a3f/original/image.png)***Problem: ****Anyone can change the balance to any value, even invalid ones! No protection, no validation.*

### **With Encapsulation (Good Way ✓)**

Now let's fix it with encapsulation:

![](https://cdn.gamma.app/s1jl3a40l6g7l02/5898b945ec234d65a5396ce0f807aa5d/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/4c01e2d1aaa640dbafa4ab140d23b3a6/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/28065ee54ffb4cf5b409d9e23978d8f9/original/image.png)**Using the Encapsulated BankAccount**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/a2e7b1684c234975aa35ffdf1b276bc2/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/4eaa8ccee79c4503939178bbfde61943/original/image.png)

## **Example 2: Student Information System**

Let's create a Student class to manage student information with proper validation:

![](https://cdn.gamma.app/s1jl3a40l6g7l02/72a8cd56d7a74eebad7209b07a5b4509/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/f352a0ce2c174fbe899d858484cdb19b/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/2e098ec050f44b0f93c64fa238d7bb99/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/deff6d077a784bb19d69d4642a62c41b/original/image.png)

### **Using the Student Class**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/182a2304ba3046e8bb2d4df6efd9f055/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/2cf3e3c805e046fcb0cbf37456d0d42b/original/image.png)

## **Example 3: Online Store Product**

Let's create a Product class for an online store:

![](https://cdn.gamma.app/s1jl3a40l6g7l02/3ecf2bc231cd4bee830aef50f90855d9/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/abaab919caee4add9eadd2132cdd7303/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/1c02cba7de3f407cb7182fadd96856a1/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/33127eedac664df7bd83de8ba1ee2e9b/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/e452a7c5099c404189a412ebee1ea08a/original/image.png)**Using the Product Class**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/0d5909c28ef644c5abc3d9dd2b0d0e52/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/cd30c9963876438a9e00e491c22a86b8/original/image.png)

## **Key Takeaways from Examples**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/055871a91de342f4bec9bdafeb3850d8/original/image.png)

## **Tips for Success**

* **Start with the attributes: **Write all private variables first
* **Then write getters: **These are easy - just return the value!
* **Next write setters: **Add if statements to validate before setting
* **Use the examples: **Look at BankAccount, Student, and Product for guidance
* **Test as you go: **After writing each method, test it in main
* **Print error messages: **When validation fails, tell the user why!

**Remember: Encapsulation = Protection!**

*Private data + Public getters/setters = Safe code*
