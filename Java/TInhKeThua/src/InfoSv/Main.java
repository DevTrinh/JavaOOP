package InfoSv;

public class Main {
    public static void main(String[]args){
        Person ps1 = new Teacher("Trinh Van Manh", 19, "Thanh Hoa", 9);
        Person ps2 = new Student("Le Thi Hoa", 20, "Ho Chi Minh", 9.9);
        ps1.display();
        ps2.display();
    }
}
