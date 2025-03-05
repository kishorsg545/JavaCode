package collections;

public class BoxingDemo
{


    public static void main(String[] args)
    {
        int num=16;
        Integer integer= new Integer(num);
        System.out.println(integer);
        Integer integer1= new Integer(17);
        System.out.println(integer1);

        Integer integer3=Integer.valueOf(num);
        System.out.println(integer3);
        int i = Integer.parseInt("20");
        System.out.println(i);
    }
}
