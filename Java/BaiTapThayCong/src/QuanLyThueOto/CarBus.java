package QuanLyThueOto;

public class CarBus extends Car{

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    private int seat;

    public CarBus(String nameCar, String nameCarCompany,int yearManufacture, double cost, int seat){
        super(nameCar,nameCarCompany,yearManufacture, cost);
        this.seat = seat;
    }

    public double tax(){
        if(getSeat()<=24){
            return (super.getCost() * (super.getCost()/100*60));
        }
        else{
            return (super.getCost() * (super.getCost()/100*80));
        }
    }

    public void display(int i){
        System.out.printf("\n%-5d%-20s%-20s%-20s%-20s%-20.1f%-20.1f ",i, getNameCar(),"Xe khach", getNameCarCompany(),getYearMannufacture(),getCost(), tax() );
        setI(i++);
    }
}
