package MyJavaTasks.CODTASK2.LibraryManagementSystem;

import java.util.ArrayList;
import java.io.*;

public class Library {
    private ArrayList<LibraryItem> items;
    private final String dataFile = "library_data.txt";

    public Library() {
        items = new ArrayList<>();
        loadItems();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
        saveItems();
    }

    public void displayItems() {
        for (LibraryItem item : items) {
            item.displayInfo();
            System.out.println();
        }
    }

    public LibraryItem searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    public void checkOutItem(String title, String dueDate) {
        LibraryItem item = searchByTitle(title);
        if (item != null && !item.isCheckedOut()) {
            item.setCheckedOut(true, dueDate);
            saveItems();
            System.out.println("Item checked out successfully.");
        } else {
            System.out.println("Item not found or already checked out.");
        }
    }

    public void returnItem(String title) {
        LibraryItem item = searchByTitle(title);
        if (item != null && item.isCheckedOut()) {
            item.setCheckedOut(false, null);
            saveItems();
            System.out.println("Item returned successfully.");
        } else {
            System.out.println("Item not found or not checked out.");
        }
    }

    private void saveItems() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataFile))) {
            oos.writeObject(items);
        } catch (IOException e) {
            System.out.println("Error saving items: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadItems() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dataFile))) {
            items = (ArrayList<LibraryItem>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Data file not found. Starting with an empty library.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading items: " + e.getMessage());
        }
    }
}
