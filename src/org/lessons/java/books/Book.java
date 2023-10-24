package org.lessons.java.books;

public class Book {

    // Attributi
    private String title;
    private int pages;
    private String author;
    private String editor;

    // Costruttori
    public Book(String title, int pages, String author, String editor) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.editor = editor;
    }

    // Metodi - Getter e Setter
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public String getAuthor() {
        return author;
    }
    public String getEditor() {
        return editor;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
