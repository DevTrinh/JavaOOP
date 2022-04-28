package InfoStudent;

public class Main {
    public static void main(String[]args){
        Student sv1 = new Student("Trinh van Manh",1001,"Thanh Hoa",9.5);
        sv1.display();
        Student sv2 = new Student();
        sv2.setName("Le Thi Hoa");
        sv2.setId(1002);
        sv2.setAddress("Dinh Thanh");
        sv2.setScore(8.8);
        sv2.display();
        System.out.println("Name sv2: "+sv2.getName());
        System.out.println("Name sv1: "+sv1.getName());
        Student sv3 = new Student(sv2);

    }

}
