package quanlytaikhoan;

import java.util.Scanner;

public abstract class TaiKhoan {
    public String getWhiteInfo(int i){
        if(i == 1){
            return "x";
        }
        return " ";
    }
    public String getNameAcc() {
        return nameAcc;
    }

    public void setNameAcc(String nameAcc) {
        this.nameAcc = nameAcc;
    }

    public String getPassAcc() {
        return passAcc;
    }

    public void setPassAcc(String passAcc) {
        this.passAcc = passAcc;
    }

    public int getCodePIN() {
        return codePIN;
    }

    public void setCodePIN(int codePIN) {
        this.codePIN = codePIN;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getWhiteInfo() {
        return whiteInfo;
    }

    public void setWhiteInfo(int whiteInfo) {
        this.whiteInfo = whiteInfo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String nameAcc;
    private String passAcc;
    private int codePIN;
    private String dateCreated;
    private int whiteInfo;
    private double price;

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    Scanner sc = new Scanner(System.in);

    public void importACC(){
        System.out.print("import name acc: ");
        nameAcc = sc.nextLine();
        System.out.print("Import Password: ");
        passAcc = sc.nextLine();
        System.out.print("Import PIN code: ");
        codePIN = sc.nextInt();
        System.out.print("Date created: ");
        dateCreated = sc.nextLine();
        System.out.print("WHITE INFO*:" +
                "\n1. Yes\n" +
                "2. No\t");
        whiteInfo  = sc.nextInt();
        System.out.print("Import Price: ");
        price = sc.nextDouble();

    }

    public void display(int i){
        System.out.printf("%-10d%-15s%-15s%-15s%-15s%-15s",i+1,getNameAcc(),getPassAcc(),getCodePIN(),getDateCreated());
    }

}
