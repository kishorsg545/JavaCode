package enumeration;

public class AdvancedPriorityEnumTest
{
    public static void main(String[] args)
    {
        for(AdvancedPriorityEnum advancedPriorityEnumpriority:AdvancedPriorityEnum.values())
        {
            String name = advancedPriorityEnumpriority.name();
            int ordinal = advancedPriorityEnumpriority.ordinal();
            int estimationCompletionTime = advancedPriorityEnumpriority.getEstimationCompletionDays();
            System.out.println("name : "+name+" , ordinal : " +
                    ""+ordinal+" , estimationCompletionDays : "+estimationCompletionTime);
        }

    }
}
