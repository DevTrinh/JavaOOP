package AbsClass;

public class main {
    public static void main(String[]args){
        System.out.println("_____");
        Person employee = new Employee("Trinh Van Manh", "Ha Noi", 3000);
        employee.display();
        Person customer = new Customer("Dam Ngoc Linh", "Thanh Hoa", 5000);
        customer.display();
    }
}
