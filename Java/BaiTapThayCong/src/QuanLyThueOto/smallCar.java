package QuanLyThueOto;

public class smallCar extends Car{
    public smallCar(String nameCar, String nameCarCompany, int yearMannufacture, double cost) {
        super(nameCar, nameCarCompany, yearMannufacture, cost);
    }
    public double tax(){
        if(super.getCost() < 50000){
            return 60 * super.getCost();
        }
        else if(super.getCost() > 150000){
            return 100 * super.getCost();
        }
        else{
            return 80 * super.getCost();
        }
    }
    public void display(int i){
        System.out.printf("\n%-5d%-20s%-20s%-20s%-20s%-20.1f%-20.1f ",i, getNameCar(),"Xe con", getNameCarCompany(),getYearMannufacture(),getCost(), tax());
        setI(i++);
    }
}
