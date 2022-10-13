package assignment2;

public class Account {
    public int id;
    public String name;
    public int balance;

    public Account() {
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int amount) {
        if (amount > 0) {
            this.setBalance(this.getBalance() + amount);
        } else {
            System.out.println("Amount must be positive");
        }
    }

    public void debit(int amount) {
        if (amount > 0 && amount <= this.getBalance()) {
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("Unsuccessful payment");
        }
    }

    public void transferTo(Account b, int amount) {
        if (amount >= 0 && amount <= this.getBalance()) {
            this.setBalance(this.getBalance() - amount);
            b.setBalance(b.getBalance() + amount);
        } else {
            System.out.println("Unsuccessful transfer");
        }
    }
}
