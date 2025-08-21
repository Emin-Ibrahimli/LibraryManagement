package BaseClass;

import BookManagement.Book;

public class Student extends User {

    public Student(String name, String userId) {
        super(name, userId);
    }

    @Override
    public void getDetails() {
        System.out.println("Student details details: " + "\n" + "Name: " + getName() + ", User ID: " + getUserId());
    }

    @Override
    public void borrowBook(Book book) {
        if(borrowedBooks.size() >= 3) {
            System.out.println("Tələbə artıq maksimum 3 kitab götürüb: " + getName());
        }else {
            borrowedBooks.add(book);
            System.out.println("Tələbə kitab götürdü: " + book.getTitle());
        }
    }
}
