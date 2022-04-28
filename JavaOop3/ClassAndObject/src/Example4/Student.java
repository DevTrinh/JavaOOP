package Example4;
import java.util.Scanner;
public class Student {
    int age;
    String name;
    public void display(){
        System.out.println("\nDISPLAY_____");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    Scanner sc = new Scanner(System.in);
    public void getInfo(){
        System.out.print("\nEnter Name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }
}
