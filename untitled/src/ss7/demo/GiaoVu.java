package ss7.demo;

public class GiaoVu extends Employee implements IDiemDanh {
    public void getSalary() {
        System.out.println("nhân lương theo tháng");
    }


    @Override
    public void diemDanh(){
        System.out.println(" co the diem danh tat ca các hoc vien cua trung tam");
    }
}
