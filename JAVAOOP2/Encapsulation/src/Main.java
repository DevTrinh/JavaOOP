import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.println("Hello World !");
        System.out.print("Enter number Person: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person [] ps = new Person[n];
        for(int i = 0; i<n; i++){
            System.out.printf("\nPERSON %d: " , i+1);
            ps[i] = new Person();
            ps[i].importInfo();
        }
        System.out.printf("%-10s%-20s%-10s%-20s","STT", "FULL NAME","AGE","ADDRESS");
        for(int i = 0; i<n; i++){
            ps[i].display(i+1);
        }
    }
}
