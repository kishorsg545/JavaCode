package multithreading;

public class SumOfIntsThreadDemo
{
    public static void main(String[] args) throws InterruptedException {
        long before = System.currentTimeMillis();
        long result=0;
        SumOfMultithreading thread1=new SumOfMultithreading(0,Integer.MAX_VALUE);
        SumOfMultithreading thread2=new SumOfMultithreading((Integer.MAX_VALUE/2)+1,Integer.MAX_VALUE);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        result=thread1.getResult()+thread2.getResult();
        System.out.println(result);
        long after = System.currentTimeMillis();
        System.out.println(after-before);
    }
}
