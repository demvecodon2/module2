package ss6.bai_tap;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4 ,"red");
        Cylinder cylinder =new Cylinder(5);
        cylinder.setRadius(3);
        cylinder.setColor("yellow");
        System.out.println(circle);
        System.out.println(cylinder);
    }

}
