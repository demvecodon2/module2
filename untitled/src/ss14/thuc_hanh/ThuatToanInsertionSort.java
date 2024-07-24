package ss14.thuc_hanh;

public class ThuatToanInsertionSort {void sort(int arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 15, 112, 113, 25, 6 };
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        ThuatToanSelectionSort ob = new ThuatToanSelectionSort();
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

}
