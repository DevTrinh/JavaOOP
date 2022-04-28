package Nhanvien;

public class Customer extends Person{
    private double balance;
    public Customer(String name, String address, double balance){
        super(name, address);
        this.balance = balance;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Address: "+getAddress());
        System.out.println("Balance: "+balance);
    }
}
