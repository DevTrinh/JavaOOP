package Rectangle;

public class Main {
    public static void main(String[]args){
        System.out.println("Tinh Toan hinh chu nhat: ");
        Caculator cal1 = new Caculator(4,6);
        System.out.println("Area: "+cal1.getArea());
        System.out.println("Perimeter: "+cal1.getPerimeter());
    }
}
