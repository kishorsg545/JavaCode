package multithreading;

public class SumOfMultithreading extends Thread
{
    private int startIndex;
    private int endIndex;
    private long result;

    public SumOfMultithreading(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run()
    {
        for(long i=startIndex; i<=endIndex;i++)
        {
            result=result+i;
        }
    }

    public long getResult() {
        return result;
    }
}
