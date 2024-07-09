package ss3.bai_tap;


public class BaiTap7 {
    public static void main(String[] args) {
        int[]arrA = {5,3,6,8,11, 16};
        int[]arrB = {13,75,1,55,14,2};
        int[]newArr = new int[arrA.length+arrB.length];
        for (int i = 0, j = 0, k = 0; k < newArr.length; i++,j++,k++) {
            if (k >= arrA.length) {
                newArr[k] = arrB[j];
            }
            else {
                newArr[k] = arrA[i];
                j--;
            }
        }
        System.out.printf("new array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

