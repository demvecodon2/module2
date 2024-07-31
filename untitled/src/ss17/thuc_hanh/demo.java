package ss17.thuc_hanh;

import java.io.IOException;
import java.io.InputStream;

public class demo {
    public static void main(String[] args)  throws IOException {
        InputStream is = System.in;
        while(true) {
            System.out.println(" nhập  1 kí tự");
            int ch = is.read();
            if(ch == 'q') {
                System.out.println("XONG");
                break;
            }
            is.skip(2);
            System.out.println("Ký tự nhận được :  " +(char)ch);
        }
    }
}
