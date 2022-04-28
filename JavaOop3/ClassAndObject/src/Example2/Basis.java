package Example2;
import java.util.Scanner;
public class Basis {
    private String basis;
    private int code;

    public String getBasis() {
        return basis;
    }

    public void setBasis(String basis) {
        this.basis = basis;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public void display(){
        System.out.println("Basis: "+getBasis());
        System.out.println("Code: "+getCode());
    }
    Scanner sc = new Scanner(System.in);
    public void importInfo(){
        System.out.print("Enter Basis: ");
        basis = sc.nextLine();
        System.out.print("\nEnter Code: ");
        code = sc.nextInt();
    }
}
