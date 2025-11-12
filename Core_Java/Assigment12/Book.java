package Assigment12;

package com.bridgelabz.oops.levelone;

class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this("Unknown", "Anonymous", 0.0);
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book javaBook = new Book("Java Programming", "James Gosling", 499.0);

        defaultBook.displayDetails();
        System.out.println();
        javaBook.displayDetails();
    }
}

