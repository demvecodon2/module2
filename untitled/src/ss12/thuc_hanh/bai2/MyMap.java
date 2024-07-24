package ss12.thuc_hanh.bai2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aad", 1);
        map.put("aad1", 2);
     for(Map.Entry<String,Integer>Entry: map.entrySet()){
         System.out.println(Entry.getKey()+" "+Entry.getValue());

    }

    }


}
