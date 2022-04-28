package AbsClass;

public class Customer extends Person{
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer(String name, String address, double balance){
        super(name, address);
        this.balance = balance;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Address: "+getAddress());
        System.out.println("Balance: "+getBalance());
    }
}
