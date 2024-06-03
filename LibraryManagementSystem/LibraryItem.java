package MyJavaTasks.CODTASK2.LibraryManagementSystem;

import java.io.Serializable;

public abstract class LibraryItem implements Serializable {
    protected String title;
    protected String author;
    protected String category;
    protected boolean isCheckedOut;
    protected String dueDate;

    public LibraryItem(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.isCheckedOut = false;
        this.dueDate = null;
    }

    public abstract void displayInfo();

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut, String dueDate) {
        isCheckedOut = checkedOut;
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return dueDate;
    }
}
