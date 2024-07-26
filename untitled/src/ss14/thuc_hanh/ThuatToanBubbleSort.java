package ss14.thuc_hanh;

public class ThuatToanBubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 23, 13, 42, 11,11};
        System.out.println("mảng dùng bubble sort:");
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("mảng sau khi dùng bubble sort:");
        for (int num : arr) {
            System.out.println(num);
        }

    }

}
