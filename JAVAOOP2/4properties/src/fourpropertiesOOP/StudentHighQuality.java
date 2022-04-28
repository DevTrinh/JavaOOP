package fourpropertiesOOP;
import java.util.Scanner;
public class StudentHighQuality extends Person{

    private double moneyBN;

    public double getMoneyBN() {
        return moneyBN;
    }

    public void setMoneyBN(double moneyBN) {
        this.moneyBN = moneyBN;
    }

    public double moneyBonus(){
        return 0;
    }
    Scanner sc = new Scanner(System.in);

    public void EnterInfo(){
        super.EnterInfo();
        System.out.print("Nhap tien thuong: ");
        moneyBN = sc.nextDouble();
    }

    public void display(int i){
        super.display(i);
        System.out.printf("%-15d", moneyBonus());
    }
}
