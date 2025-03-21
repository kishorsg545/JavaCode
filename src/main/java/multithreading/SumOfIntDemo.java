package multithreading;

public class SumOfIntDemo
{
    public static void main(String[] args)
    {
        long before = System.currentTimeMillis();
        long result=0;
        for(long i = 0; i<=Integer.MAX_VALUE; i++)
        {
            result=result+i;
        }
        System.out.println(result);
        long after = System.currentTimeMillis();
        System.out.println(after-before);
    }
}
