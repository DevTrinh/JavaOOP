package AbsClass;

public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String address, double salary){
        super(name, address);
        this.salary = salary;
    }
    @Override
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Address: "+getAddress());
        System.out.println("Salary: "+getSalary());
    }
}
