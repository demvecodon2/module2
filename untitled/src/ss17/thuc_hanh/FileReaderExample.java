package ss17.thuc_hanh;

import java.io.FileInputStream;
import java.io.IOException;


public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        try ( FileInputStream fis = new FileInputStream("src/ss17/thuc_hanh/CodeGym.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        }catch (IOException e) {
            System.out.println("IO Exception" + e.getMessage()) ;
        }



    }
}
