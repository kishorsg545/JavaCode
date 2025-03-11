package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("1","Ram");
        map.put("2","Shyam");
        map.put("3","Laxman");
        System.out.println(map);
        System.out.println(map.get("1"));
        System.out.println(map.remove("1"));
        System.out.println(map);
    }
}
