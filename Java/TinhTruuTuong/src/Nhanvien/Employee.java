package Nhanvien;

public class Employee extends Person{
    private double salary;
    public Employee(String name, String address, double salary){
        super(name, address);
        this.salary = salary;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Address: "+getAddress());
        System.out.println("Salary: "+salary);
    }
}
