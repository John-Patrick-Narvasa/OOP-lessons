package Inheritance;

public class Samples {
    
}


// inheritance
// class Person{
//     protected String name;
//     protected int age;
//     protected String address;
    
//     public Person(String name, int age, String address) {
//         this.name = name;
//         this.age = age;
//         this.address = address;
//     }
    
//     public void displayInfo() {
//         System.out.println("Name: " + name + "\n" + 
//         "Age: " + age + "\n" +
//         "Address: " + address + "\n"
//         );
//     }
    
//     public void introduce() {
//         System.out.println("Hello my name is " + name);
//     }
// }

// class Teacher extends Person {
//     protected String teacherId;
//     protected String subject;
//     protected int yearsOfExperience;
    
//     public Teacher(String name, int age, String address, String teacherId, String subject, int yearsOfExperience) {
//         super(name, age, address);
//         this.teacherId = teacherId;
//         this.subject = subject;
//         this.yearsOfExperience = yearsOfExperience;
//     }
    
//     @Override
//     public void displayInfo() {
//         System.out.println("Name: " + name + "\n" + 
//         "Age: " + age + "\n" +
//         "Address: " + address + "\n" + 
//         "Teacher ID: " + teacherId + "\n" + 
//         "Subject: " + subject + "\n" +
//         "Experience: " + yearsOfExperience + " years \n"
//         );
//     }
    
//     public void teach() {
//         System.out.println(name + " is teaching " + subject);
//     }
    
//     public void gradeAssignments() {
//         System.out.println("");
//     }
    
// }

// class Professor extends Teacher {
//     protected String researchArea;
//     protected int publications;
    
//     public Professor(String name, int age, String address, String teacherId, String subject, int yearsOfExperience, String researchArea, int publications) {
//         super(name, age, address, teacherId, subject, yearsOfExperience);
//         this.researchArea = researchArea;
//         this.publications = publications;
//     }
    
//     @Override
//     public void displayInfo() {
//         System.out.println("Name: " + name + "\n" + 
//         "Age: " + age + "\n" +
//         "Address: " + address + "\n" + 
//         "Teacher ID: " + teacherId + "\n" + 
//         "Subject: " + subject + "\n" +
//         "Experience: " + yearsOfExperience + " years \n" +
//         "Research Area: " + researchArea + "\n" + 
//         "Publications: " + publications
//         );
//     }
    
//     @Override
//     public void teach() {
//         System.out.println(name + " is teaching Advanced " + subject);
//     }
    
//     public void conductResearch() {
//         System.out.println(name + " is conducting research in " + researchArea);
//     }
    
//     public void publishPaper() {
//         publications++;
//         System.out.println("New paper published! Total publications: " + publications );
//     }
// }

// public class MyClass {
//     public static void main(String args[]) {
//         Professor p1 = new Professor("Dr. Smith", 45, "123 University Ave", "T1001", "Computer Science", 15, "Artificial Intelligence", 25);
//         Professor p2 = new Professor("Prof. Utonium", 50, "107 Pokey Oaks South", "T1002", "Chemistry", 20, "Genetics and Bio-Engineering", 40);

//         System.out.println("=== Person 1 Information ===");
//         p1.introduce();

//         System.out.println();
//         p1.displayInfo();

//         System.out.println();
//         p1.teach();
//         p1.conductResearch();
//         p1.publishPaper();

//         System.out.println("\n=== Person 2 Information ===");
//         p2.introduce();

//         System.out.println();
//         p2.displayInfo();

//         System.out.println();
//         p2.teach();
//         p2.conductResearch();
//         p2.publishPaper();
//     }
// }


//polymorphism
