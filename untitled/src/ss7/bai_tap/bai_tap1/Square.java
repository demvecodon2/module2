package ss7.bai_tap.bai_tap1;

public class Square extends Rectangle {

    public Square(double side) {
        super();
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void resize(double percent) {
        double side = getSide();
        side *= (1 + percent / 100);
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[side=" + getSide() + "]";
    }
}
