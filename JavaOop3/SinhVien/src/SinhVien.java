import java.util.Scanner;

public class SinhVien {
    String hoTen;
    int tuoi;
    String lop;
    String soDienThoai;
    public SinhVien(){

    }
    public SinhVien(String hoTen, int tuoi, String lop, String soDienThoai){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.lop = lop;
        this.soDienThoai = soDienThoai;
    }
    Scanner sc = new Scanner(System.in);
    public void nhapThongTin(){
        System.out.print("\nNhap ten: ");
        hoTen = sc.nextLine();
        System.out.print("\nNhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("\nNhap lop: ");
        sc.nextLine();
        lop = sc.nextLine();
        System.out.print("\nNhap so dien thoai: ");
        soDienThoai = sc.nextLine();
    }
    public void hienThi(){
        System.out.println("\nTen: "+hoTen);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Lop: "+lop);
        System.out.println("SDT: "+soDienThoai);
    }
}
