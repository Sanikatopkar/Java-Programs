package LibraryManagement;

public class Book {
    String title, author;
    int isbn;

    public Book(String t, String a, int i) {
        title = t;
        author = a;
        isbn = i;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}