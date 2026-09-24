package DataStructuresAndAlgorithms.LinkedLists.ChallengeTaskManager;

import java.util.LinkedList;
import java.util.ListIterator;

public class TaskManager {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Brush teeth");
        tasks.add("Go to the gym");
        tasks.add("Take a shower after the gym");
        tasks.add("Start work");
        tasks.add("Finish Work");
        System.out.println(tasks);

        tasks.addFirst("Check emails");
        System.out.println("Add a task at the beginning " + tasks);

        tasks.add(3, "Have Breakfast");
        System.out.println("Updated Task list: " + tasks);

        tasks.removeLast();
        System.out.println("Remove the last task" + tasks);

        System.out.println("Traversing forward");
        ListIterator<String> iterator = tasks.listIterator();
        int taskNumber = 1;
        while (iterator.hasNext()) {
            System.out.println(taskNumber + ". " + iterator.next());
            taskNumber++;
        }

        //Backward traversing
        System.out.println("\nTraversing backward:");
        taskNumber = 1;
        while (iterator.hasPrevious()) {
            System.out.println(taskNumber + ". " + iterator.previous());
            taskNumber++;
        }

        //if you want to stop the traverse you can include an if statement inside the while loop
        while (iterator.hasPrevious()) {
            String step = iterator.previous();
            if (step.equals("Take a shower after the gym")) {
                break; //Stop traversal when specific step is found


            }
        }
    }
}
