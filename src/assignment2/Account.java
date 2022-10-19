package assignment2;

public class Account {
    public int id;
    public String name;
    public double balance;

    public Account() {
    }

    public Account(int id, String name, double balance) {
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        if (amount > 0)
            this.setBalance(this.getBalance() + amount);
    }

    public void debit(double amount) {
        if (amount > 0 && amount <= this.getBalance())
            this.setBalance(this.getBalance() - amount);
    }

    public void transferTo(Account b, double amount) {
        if (amount > 0 && amount <= this.getBalance()) {
            b.setBalance(b.getBalance() + amount);
            this.debit(amount);
        }
    }
}
