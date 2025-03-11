package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapDemo
{

    public static void sortingOrder()
    {
    Map<Integer,String> number=new LinkedHashMap<>();
    // Duplicate values are not allowed
        //same order map is printed by LinkedHashMap
        number.put(4,"Four");
        number.put(5,"Five");
        number.put(1,"One");
        number.put(2,"Two");
        number.put(3,"Three");
        number.put(5,"Five");
        System.out.println(number);
        for(Map.Entry<Integer,String> entry:number.entrySet())
    {
        System.out.println(entry.getKey()+"="+ entry.getValue());
    }
}

public static void main(String[] args) {
    sortingOrder();
}
}
