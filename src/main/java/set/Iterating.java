package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterating
{
    public static void main(String[] args) {
        Set<String> countries=new HashSet<>();
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
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
