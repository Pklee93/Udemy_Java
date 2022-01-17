package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if(findBranch(name) == null) {
            this.branches.add(new Branch(name));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null) {
            return existingBranch.newCustomer(customerName, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null) {
            return existingBranch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String name) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if(branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null) {
            System.out.println("Customer details for branch " + existingBranch.getName());

            ArrayList<Customer> branchCustomers = existingBranch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");

                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else{
            return false;
        }
    }
}