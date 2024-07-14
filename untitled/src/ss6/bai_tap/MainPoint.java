package ss6.bai_tap;

import java.util.Arrays;

public class MainPoint {
    public static void main(String[] args) {
        Point2D p2d = new Point2D();
        Point3D p3d = new Point3D();
        p2d.setX(2);
        p2d.setY(3);
        p3d.setX(4);
        p3d.setY(5);
        p3d.setZ(6);
        System.out.println(p2d);
        System.out.println(p3d);
        System.out.println(Arrays.toString(p2d.getXY()));
        System.out.println(Arrays.toString(p3d.getXYZ()));
    }
}
