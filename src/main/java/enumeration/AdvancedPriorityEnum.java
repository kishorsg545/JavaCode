package enumeration;

public enum AdvancedPriorityEnum
{
    LOW(7),MEDIUM(5),HIGH(2),CRITICAL(1);

    private int estimationCompletionDays;

    AdvancedPriorityEnum (int estimationCompletionDays )
    {
        this.estimationCompletionDays=estimationCompletionDays;
    }

    public int getEstimationCompletionDays()
    {
        return estimationCompletionDays;
    }

}
