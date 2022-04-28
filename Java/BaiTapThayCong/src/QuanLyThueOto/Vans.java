package QuanLyThueOto;

public class Vans extends Car{
    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    private double tonnage;
    public Vans(String nameCar, String nameCarCompany, int yearMannufacture, double cost, double tonnage) {
        super(nameCar, nameCarCompany, yearMannufacture, cost);
        this.tonnage = tonnage;
    }

    public double tax(){
        if(getTonnage() < 5000){
            return (super.getCost() * (super.getCost()/100*40));
        }
        else{
            return (super.getCost() * (super.getCost()/100*60));
        }
    }
    public void display(int i){
        System.out.printf("\n%-5d%-20s%-20s%-20s%-20s%-20.1f%-20.1f ",i, getNameCar(),"Xe tai", getNameCarCompany(),getYearMannufacture(),getCost(), tax() );
        setI(i++);
    }
}
