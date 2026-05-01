package Encapsulation;

public class Samples {
    
}


// 4 codes to expand

// // Encapsulation
// // Data protection, modularity, flexibility, validation
// // getters and setters


// // CODE 1 (BAD)
// class BankAccount {
//     public double balance;
// }

// public class MyClass {
//   public static void main(String args[]) {
//     BankAccount myAccount = new BankAccount();
    
//     myAccount.balance = 1000;
    
//     myAccount.balance = -5000;
//     myAccount.balance = 999999999;
//   }
// }

// // CODE 1 (GOOD)
// class BankAccount {
//     private double balance;
    
//     // Constructor
//     public BankAccount(double initialBalance) {
//         setBalance(initialBalance);
//     }
    
//     public double getBalance() {
//         return balance;
//     }
    
//     public void setBalance(double newBalance) {
//         if (newBalance >= 0) {
//             balance = newBalance;
//         }
//         else {
//             System.out.println("Error: Balance cannot be negative!");
//         }
//     }
    
//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance = balance + amount;
//             System.out.println("Deposited: $" + amount);
//         }
//     }
    
//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance = balance - amount;
//             System.out.println("Withdrawn: $"  + amount);
//         }
//         else {
//             System.out.println("Error: Insufficient funds!");
//         }
//     }
// }

// public class MyClass {
//   public static void main(String args[]) {
//     BankAccount myAccount = new BankAccount(1000);
    
//     // See balance
//     System.out.println("Current Balance: $" + myAccount.getBalance());
    
//     // Deposit money
//     myAccount.deposit(500);
//     System.out.println("New Balance: $" + myAccount.getBalance());
    
//     // Negative balance (will fdil)
//     myAccount.setBalance(-500);
    
//     // Withdraw money
//     myAccount.withdraw(200);
//     System.out.println("Final Balance: $" + myAccount.getBalance());
    
//   }
// }


// // CODE 2
// class Student {
//     private String name;
//     private int age;
//     private double gpa;
    
//     // Constructor
//     public Student(String name, int age, double gpa) {
//         this.name = name;
//         setAge(age);
//         setGpa(gpa);
//     }
    
//     // Getters - let People READ data
//     public String getName() {
//         return name;
//     }
    
//     public int getAge() {
//         return age;
//     }
    
//     public double getGpa() {
//         return gpa;
//     }
    
//     // Setters
//     public void setName(String name) {
//         if (name != null && !name.isEmpty()) {
//             this.name = name;
//         }
//         else {
//             System.out.println("Error: Name cannot be empty!");
//         }
//     }
    
//     public void setAge(int age) {
//         if (age >= 16 && age <= 100) {
//             this.age = age;
//         }
//         else {
//             System.out.println("Error: Age must be between 16 and 100!");
//         }
//     }
    
//     public void setGpa(double gpa) {
//         if (gpa >= 0.0 && gpa <= 4.0) {
//             this.gpa = gpa;
//         }
//         else {
//             System.out.println("Error: GPA must be between 0.0 and 4.0!");
//         }
//     }
//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("GPA: " + gpa);
//     }
// }

// // SchoolSystem
// public class MyClass {
//   public static void main(String args[]) {
//     Student student1 = new Student("Alice", 20, 3.5);
    
//     // Display initial info
//     System.out.println("=== Student Information ===");
//     student1.displayInfo();
    
//     // Update GPA using setter
//     System.out.println("\n=== Updating GPA ===");
//     student1.setGpa(3.8);
//     System.out.println("New GPA: " + student1.getGpa());
    
//     // Try invalid values
//     System.out.println("\n=== Testing Validation ===");
//     student1.setAge(5); // Too Young
//     student1.setGpa(5.5); // GPA too high
//     student1.setName(""); // Empty name
    
//     // Show that invalid changes were rejected
//     System.out.println("\n=== Final Information ===");
//     student1.displayInfo(); // Data remains unchanged
//   }
// }



// class Product {
//     // Private attributes
//     private String productName;
//     private double price;
//     private int stock;
    
//     public Product(String productName, double price, int stock) {
//         this.productName = productName;
//         setPrice(price); //Use setter
//         setStock(stock); //Use setter
//     }
    
//     public String getProductName() {
//         return productName;
//     }
    
//     public double getPrice() {
//         return price;
//     }
    
//     public int getStock() {
//         return stock;
//     }
    
//     public void setPrice(double price) {
//         if (price > 0) {
//             this.price = price;
//         }
//         else {
//             System.out.println("Error: Price must be positive!");
//         }
//     }
    
//     public void setStock(int stock) {
//         if (stock >= 0) {
//             this.stock = stock;
//         }
//         else {
//             System.out.println("Error: Stock cannot be negative!");
//         }
//     }
    
//     public void sell(int quantity) {
//         if (quantity > 0 && quantity <= stock) {
//             stock = stock - quantity;
//             System.out.println("Sold " + quantity + " " + productName);
//             System.out.println("Stock remaining: " + stock);
//         }
//         else {
//             System.out.println("Error: Not enough stock!");
//         }
//     }
    
//     public void restock(int quantity) {
//         stock = stock + quantity;
//         System.out.println("Restocked " + quantity + " " + productName);
//         System.out.println("New stock: " + stock); 
//     }
    
//     public void applyDiscount(double percentage) {
//         if (percentage > 0 && percentage <= 50) {
//             double discount = price * (percentage / 100);
//             price = price - discount;
//             System.out.println(percentage + "% discount applied!");
//             System.out.println("New price: " + price);
//         }
//         else {
//             System.out.println("Error: Invalid discount percentage!");
//         }
//     }
// }


// // StoreSystem
// public class MyClass {
//   public static void main(String args[]) {
//     //   Create a product
//     Product laptop = new Product("Gaming Laptop", 1200.00, 10);
    
//     // Display info using getters
//     System.out.println("Product: " + laptop.getProductName());
//     System.out.println("Price: $" + laptop.getPrice());
//     System.out.println("Stock: " + laptop.getStock());
    
//     //  Sell some items
//     System.out.println("\n--- Selling 3 laptops ---");
//     laptop.sell(3);
    
//     // Apply discount
//     System.out.println("\n--- Applying 10% laptops ---");
//     laptop.applyDiscount(10);
    
//     // Restock
//     System.out.println("\n--- restocking 5 laptops ---");
//     laptop.restock(5);
    
//     // Try to sell more than available
//     System.out.println("\n--- Trying to sell 20 laptops ---");
//     laptop.sell(20);
//   }
// }





// class Movie {
//     // Private attributes
//     private String title;
//     private String director;
//     private int releaseYear;
//     private double rentalPrice;
//     private int availableCopies;
    
//     // Constructor
//     public Movie(String title, String director, int releaseYear, double rentalPrice, int availableCopies) {
//         setTitle(title);
//         setDirector(director);
//         setReleaseYear(releaseYear);
//         setRentalPrice(rentalPrice);
//         setAvailableCopies(availableCopies);
//     }
    
//     // Getters
//     public String getTitle() {
//         return title;
//     }
//     public String getDirector() {
//         return director;
//     }
//     public int getReleaseYear() {
//         return releaseYear;
//     }
//     public double getRentalPrice() {
//         return rentalPrice;
//     }
//     public int getAvailableCopies() {
//         return availableCopies;
//     }
    
//     // Setters
//     public void setTitle(String title) {
//         if (title != null && !title.isEmpty()) {
//             this.title = title;
//         }
//         else {
//             System.out.println("Error: Title cannot be null or empty!");
//         }
//     }
//     public void setDirector(String director) {
//         if (director != null && !director.isEmpty()) {
//             this.director = director;
//         }
//         else {
//             System.out.println("Error: Director cannot be null or empty!");
//         }
//     }
//     public void setReleaseYear(int year) {
//         if (year >= 1900 && year <= 2024) {
//             this.releaseYear = year;
//         }
//         else {
//             System.out.println("Error: Year must be between 1900 and 2024!");
//         }
//     }
//     public void setRentalPrice(double price) {
//         if (price >= 1.0 && price <= 10.0) {
//             this.rentalPrice = price;
//         }
//         else {
//             System.out.println("Error: Price must be between 1.0 and 10.0!");
//         }
//     }
//     public void setAvailableCopies(int copies) {
//         if (copies >= 0) {
//             this.availableCopies = copies;
//         }
//         else {
//             System.out.println("Error: Copies must be >= 0!");
//         }
//     }
    
//     // Additional methods
    
//     // Decrease availableCopies by 1 if copies are available, show error message if not
//     public void rentMovie() {
//         if (availableCopies > 0) {
//             availableCopies = availableCopies - 1;
//             System.out.println("Successfully rented 1 copy of " + title);
//             System.out.println("Updated available copies " + availableCopies);
//         }
//         else {
//             System.out.println("Error: There are no available copies!");
//         }
//     }
//     // Increase availableCopies by 1
//     public void returnMovie() {
//         availableCopies = availableCopies + 1;
//         System.out.println("Successfully returned 1 copy of " + title);
//         System.out.println("Updated available copies " + availableCopies);
//     }
//     // Print all movie information in a nice format
//     public void displayInfo() {
//         System.out.println("\nTitle: " + title);
//         System.out.println("Director: " + director);
//         System.out.println("Release year: " + releaseYear);
//         System.out.println("Rental price: $" + rentalPrice);
//         System.out.println("Available copies: " + availableCopies);
//     }
    
// }



// // RentalStore
// public class Samples {
//   public static void main(String args[]) {
//     // Create 2 movie objects
//     Movie movie1 = new Movie("Oppenheimer", "Christoper Nolan", 2023, 10.0 , 5);
//     Movie movie2 = new Movie("Kingsman: The Secret Service", "Matthew Vaughn", 2014, 5.0 , 10);
    
//     // Displays information for each movie
//     System.out.println("--- Two movie objects ---");
//     System.out.println("Movie 1");
//     movie1.displayInfo();
//     System.out.println("\nMovie 2");
//     movie2.displayInfo();
    
//     // Rents out a movie (decrease copies)
//     System.out.println("\n--- Rents out a movie ---");
//     System.out.println("Movie 1");
//     movie1.rentMovie();
//     System.out.println("\nMovie 2");
//     movie2.rentMovie();
    
//     // Returns a movie (increase copies)
//     System.out.println("\n--- Returns a movie ---");
//     System.out.println("Movie 1");
//     movie1.returnMovie();
//     System.out.println("\nMovie 2");
//     movie2.returnMovie();
    
//     //Tests validation by trying to set invalid values (negative price, empty title, etc.)
//     System.out.println("\n--- Test validation ---");
//     System.out.println("Movie 1");
//     movie1.setTitle("");
//     movie1.setDirector("");
//     movie1.setRentalPrice(-20);
//     movie1.setReleaseYear(1899);
    
//     System.out.println("\nMovie 2");
//     movie2.setTitle(null);
//     movie2.setDirector(null);
//     movie2.setRentalPrice(-15);
//     movie2.setReleaseYear(2025);
    
//     //Shows that the validation prevents invalid data
//     System.out.println("Movie 1");
//     movie1.displayInfo();
//     System.out.println("\nMovie 2");
//     movie2.displayInfo();
//   }
// }