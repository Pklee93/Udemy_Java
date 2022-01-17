package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String name, double transaction) {
        if(findCustomer(name) == null) {
            this.customers.add(new Customer(name, transaction));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer existingCustomer = findCustomer(name);
        if(existingCustomer == null) {
            return false;
        }
        existingCustomer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name) {
        for(int i=0; i<this.customers.size(); i++) {
            Customer existingCustomer = this.customers.get(i);
            if(existingCustomer.getName().equals(name)) {
                return existingCustomer;
            }
        }
        return null;
    }
}
