package Library_Management_System;

import java.util.Scanner;

public class Library_Management_System {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		Library library = new Library();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n==== Library Management System ====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addBookToLibrary(library);
                    break;
                case 2:
                    library.displayBook();
                    break;
                case 3:
                    borrowBookFromLibrary(library);
                    break;
                case 4:
                    returnBookToLibrary(library);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Library Management System");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }

    
    private static void addBookToLibrary(Library library) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        library.addBook(title, author);
    }

    private static void borrowBookFromLibrary(Library library) {
        System.out.print("Enter book title to borrow: ");
        String title = scanner.nextLine();
        library.borrowBook(title);
    }

    private static void returnBookToLibrary(Library library) {
        System.out.print("Enter book title to return: ");
        String title = scanner.nextLine();
        library.returnBook(title);
    }
	

}
