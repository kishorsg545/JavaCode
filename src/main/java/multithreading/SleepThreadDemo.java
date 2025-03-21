package multithreading;

public class SleepThreadDemo
{
    public static void main(String[] args) throws InterruptedException {
        long Starttime = System.currentTimeMillis();
        for(int i=0;i<5;i++)
        {
            System.out.println("Start the main method:-" +i);
            Thread.sleep(1000);
        }
        long Endtime = System.currentTimeMillis();
        System.out.println("Time take to executing"+(Endtime-Starttime));

    }
}
