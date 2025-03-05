package collectionarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> country = new ArrayList<>();
        country.add("India");
        country.add("Canada");
        country.add("USA");
        country.add("Germany");
        country.add("India");

        String[] CountryName = country.toArray(new String[country.size()]);
        System.out.println(Arrays.toString(CountryName));

        List<String> list = Arrays.asList(CountryName);

        System.out.println(list);
    }
}
