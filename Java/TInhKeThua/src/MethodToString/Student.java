package MethodToString;

public class Student {
    private String name;
    private String address;
    private double gpa;
    public Student (String name, String address, double gpa){
        this.name = name;
        this.address =address;
        this.gpa = gpa;
    }
    // khi bạn gọi hàm System.out.println() với một đối tượng thì chương trình sẽ hiển thị phương thức toString() của đối tượng đó:
    public String toString(){
        return "Name: "+ name+"\nAddress: "+address+"\nGPA: "+gpa;
    }
}
