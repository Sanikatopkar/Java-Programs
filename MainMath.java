import MathOperations.*;

public class MainMath {
    public static void main(String[] args) {

        Operations op = new Operations();

        double num = 5.7;

        System.out.println("Floor: " + op.floor(num));
        System.out.println("Ceil: " + op.ceil(num));
        System.out.println("Round: " + op.round(num));
    }
}