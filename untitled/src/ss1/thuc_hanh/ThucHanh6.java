package ss1.thuc_hanh;

import java.util.Scanner;

public class ThucHanh6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double width,height,bmi;
    System.out.println("you width");
    width = sc.nextDouble();
    System.out.println("you height");
    height = sc.nextDouble();
    bmi = width/Math.pow(height,2);
    if (bmi <18)
        System.out.println("You are underweight");
    else if (bmi<25.0)
        System.out.println("You are normar");
    else if (bmi<30)
        System.out.println("You are Overweight");
    else
        System.out.println("You are Obese");
    }
}
