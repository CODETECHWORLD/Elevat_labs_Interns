package com.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;
    private List<User> userList;

    public Library() {
        bookList = new ArrayList<>();
        userList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void issueBook(int bookId, int userId) {
        try {
            Book book = findBook(bookId);
            User user = findUser(userId);

            if (book == null) {
                System.out.println("Book not found!");
                return;
            }

            if (user == null) {
                System.out.println("User not found!");
                return;
            }

            if (book.isIssued()) {
                System.out.println("Book is already issued!");
                return;
            }

            book.setIssued(true);
            user.setIssuedBook(book);
            System.out.println("Book '" + book.getTitle() + "' issued to " + user.getName());

        } catch (Exception e) {
            System.out.println("Error while issuing book: " + e.getMessage());
        }
    }

    public void returnBook(int bookId, int userId) {
        try {
            Book book = findBook(bookId);
            User user = findUser(userId);

            if (book == null) {
                System.out.println("Invalid Book ID!");
                return;
            }

            if (user == null) {
                System.out.println("Invalid User ID!");
                return;
            }

            if (user.getIssuedBook() == null || user.getIssuedBook().getId() != bookId) {
                System.out.println("This user didn’t issue this book!");
                return;
            }

            book.setIssued(false);
            user.setIssuedBook(null);
            System.out.println("Book '" + book.getTitle() + "' returned by " + user.getName());

        } catch (Exception e) {
            System.out.println("Error while returning book: " + e.getMessage());
        }
    }

    public void displayBooks() {
        System.out.println("\n Book List:");
        if (bookList.isEmpty()) {
            System.out.println("No books available.");
        } else {
            bookList.forEach(System.out::println);
        }
    }

    public void displayUsers() {
        System.out.println("\n User List:");
        if (userList.isEmpty()) {
            System.out.println("No users registered.");
        } else {
            userList.forEach(System.out::println);
        }
    }

    private Book findBook(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    private User findUser(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
