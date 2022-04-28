package Demo1;

public class Student extends Person{
    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    private int maSv;
    private String truong;
    private String address;

    public Student(String name, int age, double gpa, int maSv, String truong, String address){
        super(name, age, gpa);
        this.maSv = maSv;
        this.truong = truong;
        this.address = address;
    }
    public void display(){
        super.display();
        System.out.println("Ma Sinh Vien: "+this.getMaSv());
        System.out.println("Truong: "+getTruong());
        System.out.println("Address: "+getAddress());
        System.out.println("GPA: "+getGpa());
    }
}
