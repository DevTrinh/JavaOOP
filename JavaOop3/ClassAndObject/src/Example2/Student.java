package Example2;
import java.util.Scanner;
//import export
public class Student extends Basis{
    private String name;
    private int age;
    private String Address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    Scanner sc = new Scanner(System.in);

    public void importInfo(){
        super.importInfo();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter Address: ");
        sc.nextLine();
        Address = sc.nextLine();

    }
    public void display(){
        super.display();
        System.out.println("\n_____DISPLAY_____\n");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Address: "+getAddress());
    }
}
