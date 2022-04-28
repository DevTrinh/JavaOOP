package QuanLyThueOto;

public abstract class Car {
    //Class Xe

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getNameCarCompany() {
        return nameCarCompany;
    }

    public void setNameCarCompany(String nameCarCompany) {
        this.nameCarCompany = nameCarCompany;
    }

    public int getYearMannufacture() {
        return yearMannufacture;
    }

    public void setYearMannufacture(int yearMannufacture) {
        this.yearMannufacture = yearMannufacture;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    private String nameCar;
    private String nameCarCompany;
    private int yearMannufacture;
    private double cost;

    public Car(String nameCar,
               String nameCarCompany,
               int yearMannufacture,
               double cost){
        this.nameCar = nameCar;
        this.nameCarCompany = nameCarCompany;
        this.yearMannufacture = yearMannufacture;
        this.cost = cost;
    }
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public abstract double tax();
    public void display(int i){
        System.out.printf("\n%-5s%-20s%-20s%-20s%-20s%-20s%-20s ","STT","TEN XE","LOAI XE","CONG TY", "NAM SX", "GIA BAN(VND)","THUE(VND)");
    }
}