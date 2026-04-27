package LibraryManagement;

public class Member {
    String name;
    int id;

    public Member(String n, int i) {
        name = n;
        id = i;
    }

    public void display() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + id);
    }
}