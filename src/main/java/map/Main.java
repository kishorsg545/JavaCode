package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        //System.out.println(capitalCities);
        Set<Map.Entry<String, String>> entries = capitalCities.entrySet(); // <key, value>

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
       
    }
}