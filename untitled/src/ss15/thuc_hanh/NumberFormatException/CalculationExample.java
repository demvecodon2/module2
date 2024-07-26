package ss15.thuc_hanh.NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.print("Enter an integer: ");
        int number2 = sc.nextInt();
        CalculationExample calc = new CalculationExample();

        calc.caculate(number,number2);

    }
    public void caculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("cộng" +a);
            System.out.println("trừ"+b);
            System.out.println("nhan "+c);
            System.out.println("chia"+d);
        }catch (Exception e) {
            System.out.println("TRƯỜNG HỢP NGOẠI LỆ" + e.getMessage());
        }
    }
}
