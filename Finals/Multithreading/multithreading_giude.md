# Lesson 7: Multithreading

Imagine your computer juggling multiple tasks at once, seamlessly switching between them without missing a beat.  Enter multithreading – a powerful computing concept that is revolutionizing how we approach software development and system administration.

### **Learning Objectives**

By the end of this module, you will be able to:

• Understand the concept of multithreading and concurrency

• Create threads using Thread class and Runnable interface

• Understand thread lifecycle and states

• Use thread methods: start(), sleep(), join(), interrupt()

• Implement thread synchronization to prevent race conditions

• Use synchronized methods and blocks

• Understand deadlock and how to prevent it

• Use inter-thread communication (wait, notify, notifyAll)

• Apply multithreading in real-world scenarios

### **What is a Thread?**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/e8f882b4e7a446b7b6966ffc7c2dabba/original/image.png)

A thread is the smallest unit of a process. It is a lightweight sub-process, a small unit of execution. In Java, threads are represented by the `Thread` class, which belongs to the `java.lang` package.

### **What is Multithreading?**

**Multithreading** is a Java feature that allows concurrent execution of two or more parts of a program to maximize CPU utilization. Each part is called a  **thread** , and threads are lightweight processes within a process.

### **Key Concepts**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/b76397330a8c47a68ae6ec27f465e820/original/image.png)### **Real-Life Analogy**

Think of a  **restaurant kitchen** . The kitchen is like a  *process* , and each chef is like a  *thread* . Multiple chefs (threads) work simultaneously on different dishes, sharing the same kitchen resources (memory), making the cooking process faster and more efficient.

### **Why Use Multithreading?**

**• Better CPU Utilization: **Make full use of processor capabilities

**• Improved Performance: **Execute multiple tasks simultaneously

**• Responsive Applications: **UI remains responsive while background tasks run

**• Resource Sharing: **Threads share memory and resources efficiently

**• Simplified Program Structure: **Separate concerns into different threads

### **Process vs Thread**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/d80c5e905a8345e281b3424cb37b4a53/original/image.png)

## **Creating Threads in Java**

Java provides two main ways to create threads:

### **Method 1: Extending Thread Class**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/01b15aed3b124ebab3751ecd7ec76ed7/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/67b5d7f4868343efa378214b8a7efe7c/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/324a65ff153241ee8d369a5647e5273b/original/image.png)

***Important: ****Call start(), NOT run()! Calling run() directly executes it in the current thread, not in a new thread.*

### **Method 2: Implementing Runnable Interface**

This is the **preferred approach** because your class can still extend another class if needed.

![](https://cdn.gamma.app/s1jl3a40l6g7l02/70866999f1a54146a0d4d228c2f07f88/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/4a5f91699d154f2e97f7a2bed3e113c8/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/4c480441a8b5468a9fc11774f8bf163d/original/image.png)

### **Comparison: Thread vs Runnable**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/25d684c9d0f74f58a51d13aad6cc2c6b/original/image.png)

## **Thread Lifecycle and States**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/8c0e56f627b2488780eb7c909b248358/original/image.png)**A thread in Java goes through various states during its lifecycle:**

1. New (or Born)
2. Runnable
3. Blocked
4. Waiting
5. Timed Waiting
6. Terminated (or Dead)

### **Thread States**

A thread in Java can be in one of the following states:

![](https://cdn.gamma.app/s1jl3a40l6g7l02/9faaff24b36c467ba82dc04aa037c14d/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/7471b9b0c7394714801a045d2138f80f/original/image.png)

### **Checking Thread State**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/de31a6686b2f4eddac9a0da124e74190/original/image.png)## **Important Thread Methods**

### **1. sleep( ) Method**

The **sleep()** method pauses the current thread for a specified time (in milliseconds).

***Example:***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/458ab20ddae34b578b9182f7c32f39f8/original/image.png)### **2. join() Method**

The **join()** method waits for a thread to die (complete execution). This is useful when you want to ensure one thread finishes before another continues.

***Example:***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/f438be25b69445899d6f6627ea3a0084/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/4eed76ba17234fbc811a7936f41edfd2/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/7a4a0ae95a8b442baef305991b7bbc48/original/image.png)

### **3. Thread Priority**

Thread priority ranges from 1 (MIN_PRIORITY) to 10 (MAX_PRIORITY). Default is 5 (NORM_PRIORITY).

![](https://cdn.gamma.app/s1jl3a40l6g7l02/1d41611a5b6249fd8e6113b5ef041d25/original/image.png)

### **4. Daemon Threads**

A **daemon thread** is a background thread that doesn't prevent the JVM from exiting. When all non-daemon threads finish, JVM terminates even if daemon threads are running.

![](https://cdn.gamma.app/s1jl3a40l6g7l02/651dddd13eff422f8da9267c248c2174/original/image.png)## **Thread Synchronization**

### **1. The Race Condition Problem**

When multiple threads access shared data simultaneously, **race conditions** can occur, leading to inconsistent or incorrect results.

***Problem Example:***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/823f38a40fb54d0c84b8620283468c0c/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/1e51e5fe339047feb5d6c04e3e858ce4/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/3ea7697adcc34cd0acbc07b679587db9/original/image.png)### **2. Synchronized Methods**

Use the **synchronized** keyword to ensure only one thread can execute a method at a time.

![](https://cdn.gamma.app/s1jl3a40l6g7l02/53c6e186b09841b994fb2450b190ff0c/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/896fcb1994d746d99a639b7230bda247/original/image.png)

### **3. Synchronized Blocks**

Synchronized blocks provide finer control - you can synchronize only specific code sections.

![](https://cdn.gamma.app/s1jl3a40l6g7l02/e05d6860132641eca3ca47f8c04c7568/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/c5cdff519341430d893ecef720bdaacd/original/image.png)

## **Understanding Deadlock**

### **What is Deadlock?**

**Deadlock** occurs when two or more threads are blocked forever, each waiting for the other to release a resource. It's like a traffic jam where no one can move.

### **Deadlock Example**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/581cc20b29d04368a800c4acd89d28bc/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/7b360c213c144053ba55e8c8f4a848dc/original/image.png)

### **Preventing Deadlock**

To prevent deadlock:

**• Lock Ordering: **Always acquire locks in the same order

**• Lock Timeout: **Use tryLock() with timeout

**• Deadlock Detection: **Monitor and detect deadlocks

**• Avoid Nested Locks: **Minimize lock nesting

***Solution - Lock Ordering:***

![](https://cdn.gamma.app/s1jl3a40l6g7l02/fe528f6ac52f406c919ef6e52b23a5ab/original/image.png)## **Inter-thread Communication**

### **1. wait(), notify(), and notifyAll()**

These methods allow threads to communicate with each other by signaling. They must be called from within a synchronized context.

![](https://cdn.gamma.app/s1jl3a40l6g7l02/0a9a5ccc7f0842f998126d117b7d692e/original/image.png)### **2. Producer-Consumer Example**

A classic example: Producer produces items, Consumer consumes them. They need to coordinate using wait/notify.

![](https://cdn.gamma.app/s1jl3a40l6g7l02/8dc6c1d10691499992c05901f19d3a20/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/3efc3793cd6a432c85c1b7b975bb3b4f/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/ee9878a411e34548a2708a5ca493723c/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/0f6cd07625bb411597a1a7165584d598/original/image.png)

## **Practical Multithreading Applications**

### **1 . Parallel Task Processing**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/faea6a7f9ec5438f8fef1599cb56fcdf/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/de6a251b816141ea82e37a86a2dafcac/original/image.png)![](https://cdn.gamma.app/s1jl3a40l6g7l02/1c8c0a54fddf46809c702b505da4b2ca/original/image.png)### 2. Download Manager Simulation

![](https://cdn.gamma.app/s1jl3a40l6g7l02/86ad03e2cbfa476ea93cce39e75fe9c4/original/image.png)

![](https://cdn.gamma.app/s1jl3a40l6g7l02/ebb21009e6d44c1c9acd398d4211e2dd/original/image.png)### Takeaways

**Multithreading **is  **a programming technique that divides a single process into smaller, independent execution units called threads, allowing them to run concurrently to improve application performance and responsiveness** . It enables multiple tasks to share CPU, memory, and I/O resources, making it ideal for parallel processing on multi-core systems

**Key Concepts and Benefits**

* **Concurrent Execution:** Multiple tasks (e.g., downloading files, UI rendering) run at the same time, increasing efficiency.
* **Lightweight Processes:** Threads are smaller than processes and faster to create and manage.
* **Resource Sharing: **Threads share the same memory space, reducing overhead.
* **Improved Responsiveness:** High-performance apps remain responsive by handling user input and backend tasks separately

**Advantages**

* **Faster Computation:** Intensive tasks are distributed across multiple CPU cores.
* **Parallelization:** Efficient for parallelizable tasks like image processing or matrix operations.
* **Better Resource Usage:** Maximizes utilization of modern multi-core processors.

**Disadvantages**

* **Increased Complexity:** Threaded code can be challenging to design, debug, and maintain.
* **Concurrency Issues:** Improper synchronization can lead to deadlocks, race conditions, and unpredictable behavior.
* **Management Overhead:** Managing too many threads may incur overhead, reducing potential benefits
