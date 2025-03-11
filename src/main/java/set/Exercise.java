package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise
{
    public static Set<String> removeVowelWords ()
    {
        Set<String> list=new HashSet<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("lynx");
        list.add("grape");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            String world = iterator.next();
            if(world.matches(".*[aeiouAEIOU].*"))
            {
                iterator.remove();
                System.out.println(list);

            }

        }

        return list;
    }

    public static void main(String[] args)
    {
        removeVowelWords ();

    }
}
