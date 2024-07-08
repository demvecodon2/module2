package ss2.bai_tap;

public class BaiTap2 {   public static void main(String[] args) {

    int n = 2;
    boolean isPrime = true;
    System.out.println("Prime numbers less than 100 are:");
    while (n <= 100) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;

            } else {
                isPrime = true;
            }
        }
        if (isPrime) {

            System.out.println(n);
        }
        n++;
    }
}
}
