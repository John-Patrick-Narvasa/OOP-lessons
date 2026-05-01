package Encapsulation;

//TODO: To be sorted each classes in a separate file

// class Student {
//     private String name;
//     private int studentId;
//     private String major;
//     private double gpa;

  
//   public Student(String name, int studentId, String major) {
//       this.name = name;
//       this.studentId = studentId;
//       this.major = major;
//       this.gpa = 0.0;
//   }
  
//   public int getStudentId() {
//       return studentId;
//   }
  
//   public void setGpa(double gpa) {
//       if (gpa >= 0.0 && gpa <= 4.0) {
//           this.gpa = gpa;
//       }
//   }
  
//   public void displayInfo() {
//       System.out.println("Student Name: " + name);
//       System.out.println("Student ID: " + studentId);
//       System.out.println("Major: " + major);
//       System.out.println("GPA: " + gpa);
//   }
// }

// public class Main {
//   public static void main(String args[]) {
//     Student student1 = new Student("Allice Johnson", 12345, "Computer Science");
//     Student student2 = new Student("Bob Smith", 12346, "Engineering");
    
//     student1.setGpa(3.8);
//     student2.setGpa(3.5);
    
//     System.out.println("=== Student 1 Information ===");
//     student1.displayInfo();

//     System.out.println("=== Student 2 Information ===");
//     student2.displayInfo();
//   }
// }

// class BankAccount {
//     private String accountHolder;
//     private String accountNumber;
//     private double balance;
    
//     public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
//         this.accountHolder = accountHolder;
//         this.accountNumber = accountNumber;
//         this.balance = initialBalance;
//     }
    
//     public void deposit(double amount) {
//         if(amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: $" + amount);
//         }
//         else {
//             System.out.println("Invalid deposit amount");
//         }
//     }
    
//     public void withdraw(double amount) {
//         if(amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: $" + amount);
//         }
//         else {
//             System.out.println("Insufficient funds or invalid amount!");
//         }
//     }
    
//     public double getBalance() {
//         return balance;
//     }
    
//     public void displayAccountInfo() {
//         System.out.println("Account Holder: " + accountHolder);
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Current Balance: $" + balance);
//     }
// }



// public class Main {
//   public static void main(String args[]) {
//     BankAccount myAccount = new BankAccount("John Doe", "ACC001", 1000.00);
    
//     System.out.println("=== Initial Account Information ===");
//     myAccount.displayAccountInfo();
    
//     System.out.println("\n=== Performing Transactions ===");
//     myAccount.deposit(500.00);
//     myAccount.withdraw(200.00);
    
//     System.out.println("\n=== Performing Transactions ===");
//     myAccount.displayAccountInfo();
//   }
// }



class Book {
    // Attributes
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int availableCopies;

    // Constructor
    public Book(String title, String author, String isbn, double price, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.availableCopies = availableCopies;
    }

    // Getter Methods
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public double getPrice() {
        return price;
    }
    public int getAvailableCopies() {
        return availableCopies;
    }

    // Displays the book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: $" + price);
        System.out.println("Available Copies: " + availableCopies);

    }

    // Selling 1 copy of the stock
    public void sellBook() {
        if (availableCopies > 0) {
            availableCopies -= 1;
            System.out.println("\nSelling 1 copy of '" + title + "'...");
            System.out.println("Sale successful! Remaining copies: " + availableCopies);
        }
    }

    // Restocking book with the given quantity
    public void restockBook(int quantity) {
        availableCopies += quantity;
        System.out.println("\nRestocking '" + title + "' with " + quantity + " copies...");
        System.out.println("Restock successful! Available copies: " + availableCopies);
    }
}



public class BookMngmtSys {
    public static void main(String args[]) {
        // Book 1
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0590353427", 79.99, 10);
        // Book 2
        Book book2 = new Book("The Lord of the Rings ", "J.R.R. Tolkien", "978-0063274730", 79.99, 15);
        // Book 3
        Book book3 = new Book("Ego Is the Enemy", "Ryan Holiday", " 978-15918478167", 15.00, 5);

        // OUTPUT:
        System.out.println("=== Book 1 Information ===" );
        book1.displayBookInfo();
        book1.sellBook();
        book1.restockBook(5);

        // OUTPUT:
        System.out.println("\n=== Book 2 Information ===" );
        book2.displayBookInfo();
        book2.sellBook();
        book2.restockBook(3);

        // OUTPUT:
        System.out.println("\n=== Book 3 Information ===" );
        book3.displayBookInfo();
        book3.sellBook();
        book3.restockBook(2);
    }
}
