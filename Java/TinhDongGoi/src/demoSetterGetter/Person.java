package demoSetterGetter;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String name;
    private String school;
    private int age;
    private String address;
    public Person(String name, int age, String school, String address){
        this.name = name;
        this.age = age;
        this.school = school;
        this.address = address;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("School: "+getSchool());
        System.out.println("Address: "+getAddress());
    }

}
