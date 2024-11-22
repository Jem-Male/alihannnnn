package models;

import models.Book;

public class Printer {
    public static void printBookInfo(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}
