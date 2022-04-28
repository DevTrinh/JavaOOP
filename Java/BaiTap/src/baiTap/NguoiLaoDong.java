package baiTap;

import java.util.Scanner;

public abstract class NguoiLaoDong {
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    private String ten;
    private String diaChi;
    private String ngaySinh;
    private String gioitinh;
    private static int i = 1;
    Scanner sc = new Scanner(System.in);

    public void nhapThongTin(){
        System.out.print("Nhap Ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap gioi tinh" +
                "\n1. Nam\t2. Nu: ");
        gioitinh = sc.nextLine();
    }
    public void display(){
        System.out.printf("%-5d%-20s%-15s%-15s%-15s",i, getTen(), getDiaChi(),getNgaySinh(), getGioitinh());
        i++;
    }

    public NguoiLaoDong(String ten, String diaChi, String ngaySinh, String gioitinh){
        this.ten = ten;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.gioitinh = gioitinh;
    }

    public abstract double tinhLuong();
}
