package OverLoadFuntion;

public class Main {

    public static void main(String[]args){
        Caculator cal = new Caculator();
        System.out.println("5 + 5 = "+ cal.sum(5,5));
        System.out.println("5 + 5 = "+ cal.sum(5,5,5));
        System.out.println("5 + 5 = "+ cal.sum(5,5,5,5));
    }
}
