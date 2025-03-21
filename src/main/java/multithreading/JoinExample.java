package multithreading;

public class JoinExample
{
    public static void main(String[] args)  {
        Thread thread=new Thread(
                ()->{
                    for(int i=0;i<5;i++)
                    {
                        System.out.println("Thread Count -A"+i);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main Thread ");
    }
}
