package ss15.thuc_hanh.ArrayIndexOutOfBoundsException;

import java.util.Random;

public class createRandom {
    public Integer [] createRandomArray(){
        Random rd = new Random();
        Integer [] arr = new Integer[9];
        System.out.println("danh sách phần tử của mảng");
        for(int i=0;i<100;i++){
            arr[i]=rd.nextInt(100);
            System.out.println(arr[i]+"");
        }
        return arr;
    }

}
