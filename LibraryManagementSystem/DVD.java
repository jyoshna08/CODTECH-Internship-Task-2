package MyJavaTasks.CODTASK2.LibraryManagementSystem;

public class DVD extends LibraryItem {
    private int duration; // Duration in minutes

    public DVD(String title, String author, String category, int duration) {
        super(title, author, category);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("DVD Title: " + title);
        System.out.println("Director: " + author);
        System.out.println("Category: " + category);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Checked Out: " + isCheckedOut);
        System.out.println("Due Date: " + dueDate);
    }
}
