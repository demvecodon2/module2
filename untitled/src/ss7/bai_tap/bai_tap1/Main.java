package ss7.bai_tap.bai_tap1;

import ss7.bai_tap.bai_tap2.Rectangle;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[5];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle();
        shapes[2] = new Square(5);
        shapes[3] = new Circle(7);
        shapes[4] = new Rectangle();

        for (Resizeable shape : shapes) {
            double resizePercent = Math.random() * 100;
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Area before resize: " + circle.getArea());
                shape.resize(resizePercent);
                System.out.println("Percent= " + resizePercent + " Area after resize: " + circle.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Area before resize: " + rectangle.getArea());
                shape.resize(resizePercent);
                System.out.println("Percent= " + resizePercent + " Area after resize: " + rectangle.getArea());
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println("Area before resize: " + square.getArea());
                shape.resize(resizePercent);
                System.out.println("Percent= " + resizePercent + " Area after resize: " + square.getArea());
            }
        }
    }
}