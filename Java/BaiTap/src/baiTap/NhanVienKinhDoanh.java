package baiTap;

import java.util.Scanner;

public class NhanVienKinhDoanh extends NguoiLaoDong{
    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    private int heSoLuong;
    private double luongCoBan;
    private double doanhThu;
    Scanner sc = new Scanner(System.in);

    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextInt();
        while(getHeSoLuong()> 15||getHeSoLuong()<=0){
            System.out.print("Nhap he so luong(1-15): ");
            heSoLuong = sc.nextInt();
        }
        System.out.print("Nhap Luong Co Ban: ");
        luongCoBan = sc.nextDouble();
        System.out.print("Nhap doanh thu: ");
        doanhThu = sc.nextDouble();
    }

    public NhanVienKinhDoanh(String ten, String diaChi, String ngaySinh, String gioitinh,int heSoLuong, double luongCoBan, double doanhThu){
        super(ten,diaChi,ngaySinh,gioitinh);
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.doanhThu = doanhThu;
    }

    public void display(){
        super.display();
        System.out.printf("%-15d%-15.1f%-15.1f%-15.1f",getHeSoLuong(), getLuongCoBan(),getDoanhThu(),tinhLuong());
    }
    public double tinhLuong(){
        return getHeSoLuong()*getLuongCoBan()+getDoanhThu()*0.05;
    }
}
