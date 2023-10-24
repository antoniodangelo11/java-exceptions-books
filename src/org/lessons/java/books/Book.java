package org.lessons.java.books;

public class Book {

    // Attributi
    private String title;
    private int pageCount;
    private String author;
    private String publisher;

    // Costruttori
    public Book(String title, int pageCount, String author, String publisher) {
        this.title = setTitle(title);
        this.pageCount = setPageCount(pageCount);
        this.author = setAuthor(author);
        this.publisher = setPublisher(publisher);
    }

    // Metodi - Getter e Setter
    public String getTitle() {
        return title;
    }
    public int getPageCount() {
        return pageCount;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }

    public String setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Il titolo non può essere vuoto.");
        }
        return title;
    }
    public int setPageCount(int pageCount) {
        if (pageCount > 0) {
            this.pageCount = pageCount;
        } else {
            throw new IllegalArgumentException("Il numero di pagine deve essere maggiore di 0.");
        }
        return pageCount;
    }
    public String setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("L'autore non può essere vuoto.");
        }
        return author;
    }
    public String setPublisher(String publisher) {
        if (publisher != null && !publisher.isEmpty()) {
            this.publisher = publisher;
        } else {
            throw new IllegalArgumentException("L'editore non può essere vuoto.");
        }
        return publisher;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
