package fourpropertiesOOP;

import java.util.Scanner;

public abstract class Person {
    private String name;
    private String school;
    private int age;
    private String address;
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

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
    Scanner sc = new Scanner(System.in);
    public void EnterInfo(){
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter School: ");
        school = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }
    public abstract double moneyBonus();
    public void display(int i){
        System.out.printf("%-10d%-20s%-20s%-10d%-20s",i, getName(), getSchool(), getAge(),getAddress());
    }
}