package multithreading;

public class SynchronizationExample
{
    public static void main(String[] args) throws InterruptedException {
        Counter count=new Counter();

        Runnable SynchronizedTask=()->
        {
            for(int i=0;i<1000;i++)
            {
                count.incrementSynchronized();
            }

        };

        Thread thread1=new Thread(SynchronizedTask);
        Thread thread2=new Thread(SynchronizedTask);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("UnSynchronized Count value : " + count.getCount());
    }
}
