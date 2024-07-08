package ss1.thuc_hanh;

import java.util.Scanner;

public class ThucHanh3 {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter width: ");
        width = sc.nextFloat();
        System.out.print("enter height: ");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println("Area is " + area);
    }
}
