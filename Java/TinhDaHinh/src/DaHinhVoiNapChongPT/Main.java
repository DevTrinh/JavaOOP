package DaHinhVoiNapChongPT;

public class Main {
    public static void main(String[]args){
        Caculator cal = new Caculator();
        System.out.println("Add 2 + 3 = "+cal.add(2,3));
        System.out.println("Add 5 + 6 + 7 = "+cal.add(5,6,7));
        System.out.println("Add 1 + 2 + 3 + 4 = "+cal.add(1,2,3,4));
        //SỐ thực
        System.out.println("Add 4.4 + 4.3 = "+cal.add(4.4,4.3));
    }
}
