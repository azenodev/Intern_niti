//Task 2 : Library Management System
/*Develop a management system that update 
records, add books and monitor. It should also 
have basic features like creating and delete 
records.*/

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}

public class LibraryManagementSystem {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to Library Management System!");
            System.out.println("1. Add Book");
            System.out.println("2. Update Record");
            System.out.println("3. Delete Record");
            System.out.println("4. Monitor");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    updateRecord();
                    break;
                case 3:
                    deleteRecord();
                    break;
                case 4:
                    monitor();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }

    private static void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        Book book = new Book(title, author, year);
        books.add(book);
        System.out.println("Book added successfully.");
    }

    private static void updateRecord() {
        System.out.print("Enter title of the book to update: ");
        String title = scanner.nextLine();
        
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Enter new title: ");
                String newTitle = scanner.nextLine();
                System.out.print("Enter new author: ");
                String newAuthor = scanner.nextLine();
                System.out.print("Enter new year: ");
                int newYear = scanner.nextInt();

                book = new Book(newTitle, newAuthor, newYear);
                System.out.println("Record updated successfully.");
                return;
            }
        }
        
        System.out.println("Book not found.");
    }

    private static void deleteRecord() {
        System.out.print("Enter title of the book to delete: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("Record deleted successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    private static void monitor() {
        System.out.println("List of Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
