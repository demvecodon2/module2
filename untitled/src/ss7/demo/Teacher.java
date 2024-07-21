package ss7.demo;

public class Teacher extends Employee implements IDiemDanh{
    @Override
    public void getSalary() {
        System.out.println("nhân lương theo giờ dạy");
    }
    @Override
    public void diemDanh(){
        System.out.println(" co the diem hoc vien của lop mình quản ly");
    }
}
