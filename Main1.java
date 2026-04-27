interface Stack {
    void push(int x);
    void pop();
    void display();
}

class IntegerStack implements Stack {
    int arr[];
    int top = -1;
    int size;

    IntegerStack(int s) {
        size = s;
        arr = new int[size];
    }

    public void push(int x) {
        if (top == size - 1) {
            System.out.println("Overflow");
        } else {
            arr[++top] = x;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Popped: " + arr[top--]);
        }
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main1 {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.pop();
        s.display();
    }
}