package ss6.thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle1 rectangle = new Rectangle1();
        System.out.println(rectangle);
        rectangle = new Rectangle1(4, 5);
        System.out.println(rectangle);
        rectangle = new Rectangle1(4, 5, "black",true);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());

    }

}
