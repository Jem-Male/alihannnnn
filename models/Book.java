package models;

public class Book {
    private String title;
    private String author;

    // Конструктор
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
