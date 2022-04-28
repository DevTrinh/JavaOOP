import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String address;

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
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    Scanner sc = new Scanner(System.in);

    public void importInfo(){
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter Address: ");
        address = sc.nextLine();
    }

    public void display(){

    }
}
