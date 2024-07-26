package ss15.thuc_hanh.ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        createRandom arrayExample = new createRandom();
        Integer[] array = arrayExample.createRandomArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + array[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
