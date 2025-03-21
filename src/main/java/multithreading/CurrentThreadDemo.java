package multithreading;

public class CurrentThreadDemo
{
    public static void main(String[] args)
    {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.threadId());

    }
}
