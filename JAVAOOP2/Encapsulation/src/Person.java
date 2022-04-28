import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Scanner sc = new Scanner(System.in);

    public void importInfo(){
        System.out.print("Import Name Person: ");
        name = sc.nextLine();
        System.out.print("Import Address Person: ");
        address = sc.nextLine();
        System.out.print("Import Age Person: ");
        age = sc.nextInt();
    }
    public void display(int i){
        System.out.printf("\n%-10s%-20s%-10d%-20s",i, getName(), getAge(), getAddress());
    }
}
