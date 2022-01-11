package academy.learnprogramming;
/*
        - Create a new class for a bank account
        - Create fields for the account number, balance, customer name, email and phone number

        - Create getters and setters for each field
        - Create two additional methods
        - 1. To allow the customer to deposit funds (this should increment the balance field).
        - 2. To allow the customer to withdraw funds. This should deduct from the balance field, but not allow the withdrawal to complete if there are insufficient funds.
        - You will want to create various code in the Main class (the one created by IntelliJ) to confirm your code is working.
        - Add some System.out.println's in the two methods above as well.
         */

public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account(){
        this("56789", 2.50, "Default name", "Default email", "Default phone number");
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double balance, String name, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String name, String email, String phoneNumber){
        this("99999", 100.55, name, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(double money){
        this.balance += money;
        System.out.println("Your balance is " + this.balance);
    }

    public void withdrawal(double money){
        if(this.balance >= money){
            this.balance -= money;
            System.out.println(money + " has been withdrawn. Your balance is " + this.balance);
        }else{
            System.out.println("You don't have enough balance to withdraw.");
        }
    }
}

