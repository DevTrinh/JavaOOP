package Interface2;

public class FulltimeEmployee extends Employee{
    public FulltimeEmployee(String name, int hour) {
        super(name, hour);
    }

    @Override
    public double caculatorSalary() {
        return 0;
    }
    //Đây là lớp kế thừa từ lớp trừu tượng Employee
    //calculateSalary() là phương thức ghi đè từ lớp
    // trừ tượng Employee, phương thức này trả về tiền
    // lương của nhân viên full-time theo công thức:
    // 8 * paymentPerHour (nhân viên full time luôn làm
    // việc 8 tiếng một ngày nên lớp FullTimeEmployee
    // không có thuộc tính workingHours)
}
