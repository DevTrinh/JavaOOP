package Info;
import java.util.Scanner;

public class Lop {
    int maLop;
    String tenLop;
    int soSinhVien;
    String chuyenNganh;
    public Lop(){

    }

    public Lop(int maLop, String tenLop, int soSinhVien, String chuyenNganh){
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.soSinhVien = soSinhVien;
        this.chuyenNganh = chuyenNganh;
    }

    Scanner sc = new Scanner(System.in);

    public void nhapThongTin(){
        System.out.println("\n_____NHAP THONG TIN_____\n");
        System.out.print("\nNhap ma lop: ");
        maLop = sc.nextInt();
        System.out.print("\nNhap ten lop: ");
        sc.nextLine();
        tenLop = sc.nextLine();
        System.out.print("\nNhap so SV: ");
        soSinhVien = sc.nextInt();
        System.out.print("\nNhap Chuyen Nganh: ");
        sc.nextLine();
        chuyenNganh = sc.nextLine();
    }

    public void display(){
        System.out.println("\n_____THONG TIN SINH VIEN_____\n");
        System.out.println("Ma Lop: "+maLop);
        System.out.println("Ten Lop: "+tenLop);
        System.out.println("So Sinh Vien: "+soSinhVien);
        System.out.println("Chuyen Nganh: "+chuyenNganh);
    }
}
