package Interface2;

public abstract class Employee implements IEmployee {
    private String name;
    private int hour;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public void hienthi() {

    }

    public Employee(String name, int hour){
        this.name = name;
        this.hour = hour;
    }
}
