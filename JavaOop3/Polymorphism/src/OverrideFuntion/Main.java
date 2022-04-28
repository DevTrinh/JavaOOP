package OverrideFuntion;

public class Main {
    public static void main(String[]args){
        Animal [] animals = new Animal[4];
        animals[0] = new Animal();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Mouse();
        for(int i = 0; i<4; i++){
            animals[i].display();
        }
    }
}
