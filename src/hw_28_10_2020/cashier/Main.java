package hw_28_10_2020.cashier;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.addProduct(new Product("Waffles", 2.5,2));
        customer1.addProduct(new Product("Kefir", 1.5,1));
        customer1.addProduct(new Product("Loaf", 0.80,1));
        customer1.addProduct(new Product("Bread",1.2,2));

        Customer customer2 = new Customer();
        customer2.addProduct(new Product("Sausage", 6.1,1));
        customer2.addProduct(new Product("Bread", 1.2,1));
        customer2.addProduct(new Product("Ketchup", 2.50,1));
        customer2.addProduct(new Product("Coca Cola",1.60,2));

        Cart cart = new Cart();
        cart.addInQueue(customer1);
        cart.addInQueue(customer2);
        cart.calculationQueue();
    }
}
