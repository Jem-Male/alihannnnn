package models;

import models.Book;
import models.Printer;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Book
        Book book = new Book("1984", "George Orwell");

        // Вывод информации о книге
        Printer.printBookInfo(book);
    }
}
