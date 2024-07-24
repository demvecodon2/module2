package ss13.thuc_hanh;

public class LinearSearch {

    public static int LinearSearch(int[] numbers, int searchNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        System.out.println(LinearSearch(numbers, 1));
    }
}
