package DaHinhVoiGhiDePT;

public class Employee extends Person{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double getSalary(){
        return super.getSalary() + getBonus();
    }
    public Employee(String name, int age, double salary, double bonus){
        super(name, age, salary);
        this.bonus = bonus;
    }
}
