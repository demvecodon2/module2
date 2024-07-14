package ss6.bai_tap;

public class Cylinder extends Circle {
    private double length;
    public Cylinder(){}
    public Cylinder(double length){
        this.length = length;
    }
    public Cylinder(double radius, double length, String color){
        super(radius, color);
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void length(double length){
        this.length = length;
    }
    public double getVolume(){
        return super.getArea()*length;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "length=" + length +","
                + super.toString() +", volume "+ getVolume()+
                '}';
    }
}
