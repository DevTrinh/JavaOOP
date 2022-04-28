package Example1;

public class Main {
    public static void main(String[]args){
        System.out.println("\n_____ENCAPSULATION_____");
        Student st1 = new Student();
        st1.setName("Trinh Van Manh");
        st1.setId("CD202185");
        st1.setAge(19);
        st1.setAddress("Thanh Hoa Province");
        System.out.println(st1.getName());
        System.out.println(st1.getAge());
        System.out.println(st1.getId());
        System.out.println(st1.getAddress());

    }
}