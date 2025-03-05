package collectionarraylist;

import java.util.ArrayList;
import java.util.List;

public class TaskManager
{
    public static List<Task> makeToDoList() {
        /* Write your code below */
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Complete assignment"));
        taskList.add(new Task("Go for a run"));
        taskList.add(new Task("Buy groceries"));
        taskList.get(1).setCompleted(true);

        for (int i = 0; i < taskList.size(); i++) {
            Task task = taskList.get(i);
            System.out.println((i + 1) + ". " + task.getDescription() + " - Completed: " + task.isCompleted());
        }
        return taskList;
    }

    public static void main(String[] args) {
        makeToDoList();
    }
}
