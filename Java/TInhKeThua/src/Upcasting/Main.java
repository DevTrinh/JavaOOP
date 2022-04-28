package Upcasting;

public class Main {
    public static void main(String[]args){
        //UPCASTING
        //Khi biến của lớp cha tham chiếu tới đối tuọng của lớp con thì đối tuọng
        //của lớp con thì đối tượng của lớp con bị chuyển kiểu dữ liệu về lớp cha
        Animal dog = new Dog();
        dog.display();
        Animal cat = new Cat();
        cat.display();
        /*
        có thể thấy đối  tượng của lớp con(Dog, Cat) bị chuyển kiểu dữ liệu về lớp cha(Animal)
        đó được gọi là upcasting
         */

    }
}
