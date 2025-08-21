package BaseClass;

import BookManagement.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private String name;
    private String userId;
    protected List<Book> borrowedBooks = new ArrayList<>();

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public abstract void getDetails();

    public abstract void borrowBook(Book book);

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
