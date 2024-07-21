package ss7.demo;

public abstract class Employee extends Person{
 private int salary;
 public abstract void getSalary();
 public void chamCong(){
     System.out.println("phải chấm công đủ 8 giờ");
 }
    @Override
    public void howToGo() {
        System.out.println("di chuyển bằng xe may");
    }
}
