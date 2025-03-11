package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo
{
    public static void main(String[] args) {
        Set<String> countries=new LinkedHashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Nepal");
        countries.add("Bhutan");
        countries.add("Nepal");
        countries.add("Nepal");
        countries.add("Nepal");
        for(String country:countries)
        {
            System.out.println(country);
        }

    }
}
