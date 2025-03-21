package multithreading;

public class SharedResource
{
    private int data;
    private boolean isEmpty=true;

    synchronized void produce(int value)
    {
        while(!isEmpty)// it is converting True to flase
        {
            try {
                // Buffer is not empty, wait for the consumer to consume
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // produces the value
        data=value;
        isEmpty=false;
        System.out.println("produce:-" + value);
        // Notify the waiting consumer
        notify();
    }

    synchronized int consume()
    {
        while(isEmpty)// isEmpty is referring to private boolean isEmpty=true;
        {
            try {
                // Buffer is not empty, wait for the consumer to consume
                wait();
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
        //consume data
        int consumedData=data;
        isEmpty=true;
        System.out.println("consumed " + consumedData);
        // Notify the waiting producer
        notify();
        return consumedData;
    }

}
