package collections;

public class UnBoxingDemo
{


    public static void main(String[] args)
    {
        int num=16;
        Integer integer= new Integer(num);
        System.out.println(integer);
        Integer integer1= new Integer(17);
        System.out.println(integer1);

        // Un boxing
       int num2=integer.intValue();
        System.out.println(num2);
    }
}
