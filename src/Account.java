public class Account {
    private int id;
    private customer Customer;
    private double balance = 0.0;

    public Account(int id, customer Customer, double balance) {
        this.id = id;
        this.Customer = Customer;
        this.balance = balance;
    }

    public Account(int id, customer Customer) {
        this.id = id;
        this.Customer = Customer;
    }

    public int getId() {
        return id;
    }

    public customer getCustomer() {
        return Customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account" +
                "id=" + id +
                ", Customer=" + Customer +
                ", balance=" + balance;
    }

    public String getCustomerName() {
        return Customer.getName();
    }

    public Account deposit(double amount) {

        this.balance = amount + balance;
        return this;
    }

    public Account withdraw(double amount)
    {
        if (balance >= amount)
        {
            this.balance = balance - amount;
        } else
        {
            System.out.println("amount withdraw exceeds the current balance");
        }
        return this;
    }
}
