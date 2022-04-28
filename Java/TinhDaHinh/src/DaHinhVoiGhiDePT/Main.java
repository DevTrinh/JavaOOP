package DaHinhVoiGhiDePT;

public class Main {
    public static void main(String[]args){
        System.out.println("Lop chinh");
        Person nhanvien1 = new Manager("Trinh Van Manh", 19,3000000,9.9);
        System.out.println("Name: "+nhanvien1.getName()+"\nAge: "+nhanvien1.getAge()+"\nSalary: "+nhanvien1.getSalary());
        nhanvien1 = new Employee("Le Thi Hoa", 19, 400000,10.5);
        System.out.println("Name: "+nhanvien1.getName()+"\nAge: "+nhanvien1.getAge()+"\nSalary: "+nhanvien1.getSalary());
    }
}
