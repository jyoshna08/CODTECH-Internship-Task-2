package MyJavaTasks.CODTASK2.LibraryManagementSystem;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, String category, int issueNumber) {
        super(title, author, category);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Checked Out: " + isCheckedOut);
        System.out.println("Due Date: " + dueDate);
    }
}
