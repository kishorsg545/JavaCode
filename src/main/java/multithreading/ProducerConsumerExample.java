package multithreading;

public class ProducerConsumerExample
{
    public static void main(String[] args)
    {
        SharedResource sharedResource =new SharedResource();
        Thread producerThread=new Thread(
                ()->
                {
                for(int i=0;i<=5;i++)
                {
                    sharedResource.produce(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                }

        );
        producerThread.start();


        Thread consumerThread=new Thread(
                ()->
                {
                    for(int i=0;i<=5;i++)
                    {
                        sharedResource.consume();
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

        );
        consumerThread.start();
    }
}
