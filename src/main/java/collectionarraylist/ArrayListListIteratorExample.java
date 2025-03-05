package collectionarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIteratorExample
{
    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();

        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        ListIterator<String> iterators=countryNames.listIterator();
        {
            while (iterators.hasNext())
            {
                String country=iterators.next();
                System.out.println(country);
            }
            while (iterators.hasPrevious())
            {
                String country=iterators.previous();
                System.out.println(country);
            }

        }
    }
}
