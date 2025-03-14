package enumeration;

public class TaskPriorityConstantDemo
{
    private PriorityEnum priority;

    public static void main(String[] args) {
        PriorityEnum priorityEnum = null;
        System.out.println(TaskUtli.getEstimatedCompletionTime(PriorityEnum.LOW));
        System.out.println(TaskUtli.getEstimatedCompletionTime(PriorityEnum.MEDIUM));
        System.out.println(TaskUtli.getEstimatedCompletionTime(PriorityEnum.HIGH));
        System.out.println(TaskUtli.getEstimatedCompletionTime(PriorityEnum.CRITICAL));
        System.out.println(PriorityEnum.CRITICAL);
    }

}
