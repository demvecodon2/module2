package ss2.bai_tap;

public class BaiTap1 {
    public static void main(String[] args) {
        byte quantityPrime = 0;
        int motSo = 0;
        while (quantityPrime < 20) {
            if (checkPrime(motSo)) {
                System.out.println(motSo);
                quantityPrime++;
            }
            motSo++;
        }
    }
    public static boolean checkPrime(int motSo) {
        if (motSo < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(motSo); i++) {
            if (motSo % i == 0) {
                return false;
            }
        }
        return true;
    }
}
