import LibraryManagement.*;

public class MainLib{
    public static void main(String[] args) {

        Book b = new Book("Java", "James", 101);
        Member m = new Member("Sanika", 1);

        b.display();
        m.display();
    }
}