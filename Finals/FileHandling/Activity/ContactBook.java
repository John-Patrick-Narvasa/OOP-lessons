package Activity;

import java.io.*;
import java.util.*;

public class ContactBook {
    private static final String FILENAME = "contacts.txt";
    public static void addContact(Contact contact) {
        try (BufferedWriter writer = new BufferedWriter(
            new FileWriter(FILENAME, true)
        )) {
            writer.write(contact.getName() + "," + contact.getPhone() + "," + contact.getEmail());
            writer.newLine();
            System.out.println("Contact added successfully!");
        } catch (IOException e) {
            System.out.println("Error adding contact: " + e.getMessage() );
        }
    }

    public static void displayAllContacts() {
        try (BufferedReader reader = new BufferedReader(
            new FileReader(FILENAME)
        )) {
            System.out.println("\n=== Contact Records ===");
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("Name: " + parts[0] + ", Phone: " + parts[1] + ", Email: " + parts[2] );
            }

        } catch (FileNotFoundException e) {
            System.out.println("No contacts found. File doesn't exist yet.");
        } catch (IOException e) {
            System.out.println("Error displaying contacts: " + e.getMessage());
        }
    }

    public static Contact searchContact(String name) {
        try (BufferedReader reader = new BufferedReader(
            new FileReader(FILENAME)
        )) {
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts[0].equals(name)) {
                    System.out.println("Found: Name=" + parts[0] + ", Phone=" + parts[1] + ", Email=" + parts[2]);
                    found = true;
                    break;
                }
            }
            if(!found) {
                System.out.println("Contact with name " + name + " not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No contacts file found.");
        } catch (IOException e) {
            System.out.println("Error searching: " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n=== Contact Book ===");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit"); 

            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    addContact(new Contact(name, phone, email));
                    break;

                case 2: 
                    displayAllContacts();
                    break;

                case 3: 
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    searchContact(searchName);
                    break;

                case 4: 
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
