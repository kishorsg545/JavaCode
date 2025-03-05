package collectionarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorExample
{
    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();

        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        Iterator<String> iterators=countryNames.iterator();
        {
            while (iterators.hasNext())
            {
                String country=iterators.next();
                System.out.println(country);
                if(country.equals("India"))
                {
                    iterators.remove();
                }

            }
            System.out.println(countryNames);
        }
    }

}
