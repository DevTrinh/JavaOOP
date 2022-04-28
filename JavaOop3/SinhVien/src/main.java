public class main {
    public static void main(String[]args){
        int i = 0;
        SinhVien SV1 = new SinhVien();
        SinhVien SV2 = new SinhVien("Trinh Van Manh", 19,"LTMT3","0868841059");
        SinhVien SV3 = new SinhVien("Dam Ngoc Linh", 18,"LTMT3","086888221");

        SV1.nhapThongTin();
        if(SV1.tuoi > SV2.tuoi && SV1.tuoi >SV3.tuoi){
            SV1.hienThi();
        }
        else if(SV2.tuoi > SV1.tuoi && SV2.tuoi >SV3.tuoi){
            SV2.hienThi();
        }
        else{
            SV3.hienThi();
        }

    }
}
