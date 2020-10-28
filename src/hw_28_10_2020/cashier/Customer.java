package hw_28_10_2020.cashier;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Product> products;

    public Customer() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "products=" + products.toString() +
                '}';
    }
}
