package linkedlist;

import java.util.*;

public class LinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList<Integer> name=new LinkedList<>();
        List<Integer> name1=new LinkedList<>();
        var countryName=new LinkedList<String>();
        countryName.add("India");
        countryName.add("USA");
        countryName.add("germany");
        countryName.add("Frances");
        countryName.add("Australia");
        countryName.add("netherlands");
        countryName.add("USA");
        System.out.println(countryName);
        countryName.set(3,"pakistan");
        System.out.println(countryName);
        countryName.remove(3);
        System.out.println(countryName);
        String first = countryName.getFirst();
        String Last = countryName.getLast();
        List<String> reversecountryName = countryName.reversed();
        System.out.println(reversecountryName);

        Iterator<String> it=countryName.iterator();
        while(it.hasNext())
        {
            String name5 = it.next();
            System.out.println(name5.toLowerCase());
        }
        for(String country:countryName)
        {
            System.out.println(country.toUpperCase());
        }

        ListIterator<String> it1=countryName.listIterator();
        while(it1.hasNext())
        {
            String name5 = it1.next();
            System.out.println(name5);
        }
        while(it1.hasPrevious())
        {
            String name5 = it1.previous();
            System.out.println(name5);
        }
    }
}
