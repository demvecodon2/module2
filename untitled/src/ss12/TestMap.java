package ss12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("hiếu", 23);
        map.put("nguyên", 27);
        map.put("askfsaf", 30);
        System.out.println(map);
        System.out.println("....");
        Map<String, Integer> TreeMap = new TreeMap<>(map);
        System.out.println("TreeMap = " + TreeMap);
        System.out.println("...");
        Map<String, Integer> LinkedHasMap = new LinkedHashMap<>(16, 0.75f, true);
        LinkedHasMap.put("A", 1);
        LinkedHasMap.put("B", 2);
        LinkedHasMap.put("C", 3);
        LinkedHasMap.put("D", 4);
        System.out.println("LinkedHashMap = " + LinkedHasMap.get("C") + "\n");

    }
}
