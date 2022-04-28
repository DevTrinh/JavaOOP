package infoClass;

public class main {
    public static void main(String[]args){
        System.out.println("Xin chao trinh van manh !");
        Person tc1 = new Teacher("Trinh Van Manh", 19, "Thanh Hoa", 1000);
        tc1.display();
        tc1 = new Student("Trinh Van Manh2", 20, "Ha Noi", 2.122);
        tc1.display();
    }
}
