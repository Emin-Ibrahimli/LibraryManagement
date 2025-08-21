package BaseClass;

import BookManagement.Book;

import java.util.ArrayList;
import java.util.List;
import BookManagement.Book;


public class Library {

    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
