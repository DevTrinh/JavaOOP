package DaHinhThongQuaCacDoiTuongDahinh;

public class Main {
    public static void main(String[]args){
        Animal animal = new Animal();
        animal = new Cat();
        animal.display();
        animal = new Dog();
        animal.display();
        animal = new Animal();
        animal.display();

    }
}
