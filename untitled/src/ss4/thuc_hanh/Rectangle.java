package ss4.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width,height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return (width * height)*2;
    }
    public String display() {
        return "lớp hình chữ nhật{x"+width+"y"+height+"}";

    }
}

