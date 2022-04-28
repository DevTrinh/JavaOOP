package Info;

public class main {
    public static void main(String[]args){
        System.out.println("______________________________\n");
        Lop Lop1 = new Lop(315,"LTMT3",61,"CNTT");
        Lop Lop2 = new Lop(312,"CO DIEN TU",55,"COKHI");
        Lop Lop3 = new Lop();
        Lop3.nhapThongTin();
        if(Lop1.soSinhVien < Lop2.soSinhVien & Lop1.soSinhVien < Lop3.soSinhVien){
            System.out.println("\n_____THONG TIN LOP CO SO SV IT NHAT_____");
            Lop1.display();
        }
        else if(Lop2.soSinhVien < Lop1.soSinhVien & Lop2.soSinhVien < Lop3.soSinhVien){
            System.out.println("\n_____THONG TIN LOP CO SO SV IT NHAT_____");
            Lop2.display();
        }
        else{
            System.out.println("\n_____THONG TIN LOP CO SO SV IT NHAT_____");
            Lop3.display();
        }
    }
}
