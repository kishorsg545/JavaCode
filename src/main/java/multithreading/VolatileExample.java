package multithreading;

public class VolatileExample
{
    public static void main(String[] args) throws InterruptedException {
        ShareBooleanResource shareBooleanResource=new ShareBooleanResource();
        Thread workedThread=new Thread(()->shareBooleanResource.doWork());


        Thread StopperThread=new Thread(()->
        {
            try {
                Thread.sleep(10);
                shareBooleanResource.setStopFlag();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        workedThread.start();
        StopperThread.start();
        workedThread.join();
        StopperThread.join();
    }
}
