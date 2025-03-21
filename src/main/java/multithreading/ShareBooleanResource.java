package multithreading;

public class ShareBooleanResource
{

    private volatile boolean stopFlag=false;

    public void setStopFlag()
    {
        stopFlag=true;
    }
    public void doWork()
    {
        while (!stopFlag)
        {
            System.out.println("Working");
        }
        System.out.println("Working stopped");
    }
}
