package ss10.thuc_hanh;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        for (int i = 0; i <listInteger.size() ; i++) {
            System.out.println(listInteger.get(i));
        }

//        System.out.println(listInteger.get(3));
//        System.out.println(listInteger.get(1));
//        System.out.println(listInteger.get(2));
//        listInteger.add(6);
//        System.out.println(listInteger.get(6));
    }
}
