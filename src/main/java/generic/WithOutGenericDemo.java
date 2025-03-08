package generic;

import java.util.ArrayList;

public class WithOutGenericDemo
{
    public static void main(String[] args)
    {
        // Without generic we can do but it is not recommended because it is not type safe
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("Ram");
        list.add(true);
        int o =(Integer) list.get(0);
        String o1 =(String) list.get(1);
        boolean o2 =(Boolean) list.get(2);

        System.out.println(o1);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ram");
        list1.add("Shyam");
    }
}
