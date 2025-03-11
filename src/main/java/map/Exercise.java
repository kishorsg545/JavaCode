package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise
{
    public static Map<String,Integer> countryLengthMap()
    {

        List<String> countries = List.of("India", "USA", "Japan", "France", "Canada");
        Map<String,Integer> countryLengthMap =new HashMap<>();


        for(String country : countries)
        {
            Integer length = countryLengthMap.put(country, country.length());
        }
        Set<Map.Entry<String,Integer>> entries=countryLengthMap.entrySet();
        {
            for(Map.Entry<String,Integer> entry:entries)
            {
                String key=entry.getKey();
                Integer value=entry.getValue();
                System.out.println(key+" : "+value);
            }
        }

        return countryLengthMap;
    }
    public static void main(String[] args)
    {
        countryLengthMap();
    }
}
