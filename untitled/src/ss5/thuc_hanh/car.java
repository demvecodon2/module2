package ss5.thuc_hanh;

public class car {
    private String name;
    private String color;
    public static int numberOfCars;
    public car(String name, String color) {
        this.name = name;
        this.color = color;
        numberOfCars++;
    }

}
