package MyJavaTasks.CODTASK2.LibraryManagementSystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Added Successfully to Library Management System");
            System.out.println("1. Add new item");
            System.out.println("2. Check out item");
            System.out.println("3. Return item");
            System.out.println("4. Display all items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Select item type:");
                    System.out.println("1. Book");
                    System.out.println("2. Magazine");
                    System.out.println("3. DVD");
                    System.out.print("Enter your choice: ");
                    int itemType = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();

                    switch (itemType) {
                        case 1:
                            System.out.print("Enter number of pages: ");
                            int pages = scanner.nextInt();
                            scanner.nextLine();  // Consume newline
                            library.addItem(new Book(title, author, category, pages));
                            break;
                        case 2:
                            System.out.print("Enter issue number: ");
                            int issueNumber = scanner.nextInt();
                            scanner.nextLine();  // Consume newline
                            library.addItem(new Magazine(title, author, category, issueNumber));
                            break;
                        case 3:
                            System.out.print("Enter duration (minutes): ");
                            int duration = scanner.nextInt();
                            scanner.nextLine();  // Consume newline
                            library.addItem(new DVD(title, author, category, duration));
                            break;
                        default:
                            System.out.println("Invalid item type.");
                    }
                    break;

                case 2:
                    System.out.print("Enter title to check out: ");
                    String checkOutTitle = scanner.nextLine();
                    System.out.print("Enter due date (YYYY-MM-DD): ");
                    String dueDate = scanner.nextLine();
                    library.checkOutItem(checkOutTitle, dueDate);
                    break;

                case 3:
                    System.out.print("Enter title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnItem(returnTitle);
                    break;

                case 4:
                    library.displayItems();
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
