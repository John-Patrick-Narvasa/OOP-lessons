# Lesson 3: Inheritance

**Learning Objectives**

By the end of this module, you will be able to:

• Understand the concept and purpose of inheritance in Java

• Create parent (superclass) and child (subclass) relationships

• Use the extends keyword to implement inheritance

• Apply the super keyword for constructors and methods

### What is Inheritance?

Inheritance is a fundamental principle in object-oriented programming that allows a class to **inherit** properties (attributes) and behaviors (methods) from another class. This creates a parent-child relationship between classes, promoting code reuse and establishing hierarchical relationships.

### Real-Life Analogy

Think about vehicles in the real world. All **vehicles** share common features: they have a brand, a model, and they can start and stop. But a **car** is a specific type of vehicle that has all vehicle features PLUS additional car-specific features like the number of doors. Similarly, a **motorcycle** is also a vehicle but with different specific features. Both car and motorcycle *inherit* from vehicle.

### Key Terminology

| **Term**                | **Meaning**                                        |
| ----------------------------- | -------------------------------------------------------- |
| **Superclass / Parent** | The class whose properties and methods are inherited     |
| **Subclass / Child**    | The class that inherits from the parent class            |
| **extends**             | Java keyword used to establish inheritance               |
| **super**               | Keyword to access parent class members                   |
| **@Override**           | Annotation indicating a method overrides a parent method |

![](https://cdn.gamma.app/s1jl3a40l6g7l02/4733b1ae165649dda489d8bcfbb0f4ca/original/image.png)[Inheritance in Java with Examples - Great Learning Blog: Free Resources what Matters to shape your Career!]()

### Benefits of Inheritance

• **Code Reusability: **Write common code once in parent class, use in all children

• **Hierarchical Organization: **Models real-world relationships naturally

• **Easier Maintenance: **Changes in parent class automatically apply to children

• **Foundation for Polymorphism: **Enables advanced OOP concepts

# Let's start programing…….

We group the "inheritance concept" into two categories:

* **subclass** (child) - the class that inherits from another class
* **superclass** (parent) - the class being inherited from

To inherit from a class, use the `extends` keyword.

![](https://cdn.gamma.app/s1jl3a40l6g7l02/c7f8698be5ca446fb158cd8b0dfe82ce/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/95f728f1d9854315a4cdfe1f82ccab01/original/image.png)

#### Example 1: Basic Inheritance (Person, Student, & Main Classes)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/025ce2142ce94db7a955afa327ae5e5f/original/image.png)

**Key Points:**

• The triangle arrow pointing upward shows that Student *extends* Person

• Student **inherits** name and age from Person

• Student **inherits** displayInfo() and greet() methods from Person

• Student **adds** its own attributes: studentId and major

• Student **adds** its own methods: study() and displayStudentInfo()

### The Person Class (Parent)

Let's create a basic Person class that will serve as our parent class:

![](https://cdn.gamma.app/s1jl3a40l6g7l02/34d290318a764c8eb5bdd69c54efce91/original/image.png)### The Student Class (Child)

Now let's create a Student class that **extends** Person. Student will inherit all Person's attributes and methods, plus add its own:

![](https://cdn.gamma.app/s1jl3a40l6g7l02/3d5eb0a2c4dd4e2fadc8fb3a1b36ec15/original/image.png)### **Using Inheritance »> Main Class**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/8b8037dc5720472faa66eac6c7a40547/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/6acc5403700f4e3791c2c1f06daaa139/original/image.png)***Key Points: ****Notice how Student inherits name and age from Person, can call Person's methods like greet() and displayInfo(), and adds its own attributes (studentId, major) and methods (study()).*

![](https://cdn.gamma.app/s1jl3a40l6g7l02/a063e1faaed54e48aff5cc51d3b1cdba/original/image.png)
