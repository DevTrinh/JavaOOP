package Demo1;

public class Person {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private int age;
    private String name;
    private double gpa;
    public Person(String name, int age, double gpa){
        this.name = name;
        this.age  = age;
        this.gpa = gpa;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Gpa: "+getGpa());
    }

}
