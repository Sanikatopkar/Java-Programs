interface Exam {
    void getRollNo();
    void setRollNo(int r);
}

// Base class
class Student implements Exam {
    int rollNo;

    public void setRollNo(int r) {
        rollNo = r;
    }

    public void getRollNo() {
        System.out.println("Roll No: " + rollNo);
    }
}

// Derived class
class Result extends Student {
    int m1 = 50, m2 = 60;

    void display() {
        int total = m1 + m2;
        System.out.println("Marks = " + total);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRollNo(101);
        r.getRollNo();
        r.display();
    }
}