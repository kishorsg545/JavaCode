package linkedlist;

import java.util.*;

public class
SortingDemo
{
    public static void main(String[] args) {
        List<Integer> number=new LinkedList<>();
        number.add(10);
        number.add(1);
        number.add(25);
        number.add(4);
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);
        Collections.reverse(number);
        System.out.println(number);
        Collections.sort(number, Comparator.reverseOrder());

        var countries=new LinkedList<String>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("France");
        countries.add("Canada");
        System.out.println(countries);
        countries.sort(Comparator.naturalOrder());
        System.out.println(countries);
        countries.sort(Comparator.reverseOrder());
        System.out.println(countries);

        var countries1=new LinkedList<String>();
        countries1.add("India");
        countries1.add("USA");
        countries1.add("Japan");
        countries1.add("France");
        countries1.add("Canada");
        //countries1.sort(new LastCharComparator());
        Collections.sort(countries1,new LastCharComparator());
        System.out.println(countries1);


    }
}
