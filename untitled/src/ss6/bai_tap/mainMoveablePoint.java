package ss6.bai_tap;

import java.util.Arrays;

public class mainMoveablePoint {
    public static  void main(String[] args) {
        Point p = new Point();
        MoveablePoint m = new MoveablePoint();
        System.out.println(m);
        m.setX(3);
        m.setY(5);
        System.out.println(m);
        System.out.println(Arrays.toString(m.move()));


    }
}
