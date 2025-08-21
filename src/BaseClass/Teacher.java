package BaseClass;

import BookManagement.Book;

public class Teacher extends User {

    public Teacher(String name, String userId) {
        super(name, userId);
    }

    @Override
    public void getDetails() {
        System.out.println("Teacher details: " + "\n" + "Name: " + getName() + ", User ID: " + getUserId());
    }

    @Override
    public void borrowBook(Book book) {
        if(borrowedBooks.size() >= 5) {
            System.out.println("Müəllim artıq maksimum 5 kitab götürüb: " + getName());
        }else {
            borrowedBooks.add(book);
            System.out.println("Müəllim kitab götürdü: " + book.getTitle());
        }
    }


}
