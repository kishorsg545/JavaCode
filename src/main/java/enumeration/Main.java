package enumeration;

import static enumeration.TaskUtli.getEstimatiedCompletionTime;

public class Main {
    public static void main(String[] args) {;
        System.out.println(getEstimatiedCompletionTime(PriorityEnum.LOW));
        System.out.println(getEstimatiedCompletionTime(PriorityEnum.MEDIUM));
        System.out.println(getEstimatiedCompletionTime(PriorityEnum.HIGH));
        System.out.println(getEstimatiedCompletionTime(PriorityEnum.CRITICAL));
    }
}
