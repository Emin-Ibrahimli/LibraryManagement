package LibraryManagement;

import BaseClass.Library;
import BaseClass.Student;
import BaseClass.User;
import BookManagement.Book;

public class LibraryManagementApp {
    public static void main(String[] args) {

        Book book1 = new Book("Moon","Max","21231");
        Book book2 = new Book("Ulduz","Martin","41341");
        Book book3 = new Book("Rain","Elizabet","23451");
        Book book4 = new Book("Sun","Alex","66143");
        Book book5 = new Book("Moon","David","16466");
        Book book6 = new Book("Money","Artur","79796");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.printAllBooks();

        Student user1 = new Student("Ehmed","31231");
        user1.getDetails();
        user1.borrowBook(book1);
        user1.borrowBook(book2);
        user1.borrowBook(book3);
        user1.borrowBook(book4);
    }
}
