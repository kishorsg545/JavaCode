package enumeration;

public class TaskUtli
{
    public static int getEstimatedCompletionTime(PriorityEnum priorityenum)
    {
        return switch (priorityenum)
        {
            case LOW->7;

            case MEDIUM->5;

            case HIGH->3;

            case CRITICAL->1;


        };

    }
}
