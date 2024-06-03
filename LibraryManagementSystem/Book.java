package MyJavaTasks.CODTASK2.LibraryManagementSystem;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, String category, int numberOfPages) {
        super(title, author, category);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Pages: " + numberOfPages);
        System.out.println("Checked Out: " + isCheckedOut);
        System.out.println("Due Date: " + dueDate);
    }
}
