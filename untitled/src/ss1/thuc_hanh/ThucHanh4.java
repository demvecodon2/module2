package ss1.thuc_hanh;

import java.util.Scanner;

public class ThucHanh4 {
    public static void main(String[] args) {
        System.out.println("linear eqution resolv");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter equation: ");
        double a = sc.nextDouble();
        System.out.println("b");
        double b = sc.nextDouble();
        System.out.println("c");
        double c = sc.nextDouble();
        if (a!=0 ) {
            double answer=(b-c)/a;
            System.out.printf("Equation pass with x = %f!\n", answer);

        }else if (b==c) {
            System.out.println("The equation has no solution");

        }else {
            System.out.println("The equation has no solution");
        }
    }
}
