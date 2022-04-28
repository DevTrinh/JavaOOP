package Interface2;

public class PasstimeEmployee extends Employee{
    //workingHours là thuộc tính chỉ số giờ làm việc trên 1 ngày của nhân viên.
    //calculateSalary() là phương thức ghi đè từ lớp trừ tượng Employee, phương
    //thức này trả về tiền lương của nhân viên part-time theo công thức: workingHours * paymentPerHour.
    private int workingHour;
    public PasstimeEmployee(String name, int hour, int workingHour){
        super(name, hour);
        this.workingHour = workingHour;
    }
    public void hienthi(){

    }
    @Override
    public double caculatorSalary() {
        return 0;
    }
}