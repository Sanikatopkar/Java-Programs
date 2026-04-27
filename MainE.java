import Ecommerce.*;

public class MainE {
    public static void main(String[] args) {

        Product p = new Product("Laptop", 50000);
        Customer c = new Customer("Sanika");
        Order o = new Order(p, 2);

        c.display();
        p.display();
        o.total();
    }
}