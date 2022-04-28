package DownCasting;

public class Main {
    public static void main(String[]args){
        //chuyển kiểu dữ liêuj từ lớp cha sang lớp con thì là downcasting
        System.out.println("DownCasting");
        Animal animal = new Cat();
        //DownCasting
        ((Cat)animal).play();
    }
}
