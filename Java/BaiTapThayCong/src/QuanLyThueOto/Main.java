package QuanLyThueOto;

public class Main {
    public static void main(String[]args){
        System.out.println("\t\t_____TINH THUE OTO_____\n\n");
        Car[] car = new Car[3];
        car[0] = new CarBus("Bus Ha Noi","HN COMPANY",2015,20000000, 30);
        car[1] = new smallCar("mercedes benz", "Mercedes", 2020, 50000000);
        car[2] = new Vans("Lux 07", "Vinfast", 2019,1000000000, 6000);
        System.out.printf("\n%-5s%-20s%-20s%-20s%-20s%-20s%-20s ","STT","TEN XE","LOAI XE","CONG TY", "NAM SX", "GIA BAN(VND)","THUE(VND)");
        for(int i = 0; i<3; i++ ){
            car[i].display(i+1);
        }
    }
}
