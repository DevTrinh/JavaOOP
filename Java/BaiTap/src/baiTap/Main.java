package baiTap;

public class Main {
    public static void main(String[]args){
        System.out.println("\t\t_____QUAN LY NHAN VIEN_____\n\n");
        NguoiLaoDong nv1 = new NhanVienKinhDoanh("Trinh Van Manh", "Thanh Hoa","10/10/2002","Nam",4,3000000,100000000);
        System.out.printf("%-5s%-20s%-15s%-15s%-15s%-15s%-15s%-15s%-15s",
                "STT","HO VA TEN","QUE QUAN","NGAY SINH","GIOI TINH","HE SO LUONG","LUONG CB","DOANH THU","TONG LUONG");
        System.out.println("");
        nv1.display();
    }
}
