package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        Set<String> countries=new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Nepal");
        countries.add("Bhutan");
        countries.add("Nepal");
        countries.add("Nepal");
        countries.add("Nepal");
        System.out.println(countries.size());
        System.out.println(countries);
        boolean name = countries.contains("Nepal");
        System.out.println(name);
        boolean isRemoved = countries.contains("Nepal");
        System.out.println(isRemoved);
        System.out.println(countries);
    }
}
