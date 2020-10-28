package hw_28_10_2020.cashier;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Cart {
    private ArrayDeque<Customer> queue;

    public Cart() {
        this.queue = new ArrayDeque<>();
    }

    public void addInQueue(Customer customer) {
        this.queue.add(customer);
    }

    public void removeFromTheQueue() {
        this.queue.remove();
    }

    public void calculationQueue() {
        double Cheque = 0;
        ArrayList<Product> products = this.queue.element().getProducts();
        for (Product product : products) {
            if (product.getAmount() > 1) {
                Cheque += product.getPrice() * product.getAmount();
            } else {
                Cheque += product.getPrice();
            }
        }
        System.out.println(this.queue.element().toString());
        System.out.println("For payment: " + Cheque + " BYN");

        removeFromTheQueue();

        if (this.queue.peek() != null) {
            calculationQueue();
        } else {
            System.out.println("The queue is calculated");
        }
    }
}
