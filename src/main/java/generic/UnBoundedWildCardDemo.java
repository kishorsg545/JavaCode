package generic;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo
{
    public static void main(String[] args)
    {
    List<String> a= Arrays.asList("A","abc");
    printArray(a);
        List<Integer> a1= Arrays.asList(1,2,3,4,5);
        printArray(a1);

    }
    public static void printArray(List<?> list)
    {
        for(Object s : list)
        {
            System.out.println(s);
        }
        System.out.println(list.size());
    }
}
