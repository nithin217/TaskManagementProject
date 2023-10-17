package TaskManagement;
import java.util.ArrayList;
import java.util.Scanner;
public class ProjectCreation {
	Scanner sc = new Scanner(System.in);
	ArrayList<TaskConsDes> taskList = new ArrayList<TaskConsDes>();
	int taskIdCounter = 1;
	
	 public void ViewTasks() {
	        if (taskList.isEmpty()) {
	            System.out.println("No tasks found.");
	        } else {
	            for (TaskConsDes task : taskList) {
	                String completionStatus = task.isCompleted() ? "Completed" : "Not Completed";
	                System.out.println("Task ID: " + task.getTaskId());
	                System.out.println("Description: " + task.getTaskDescription());
	                System.out.println("Due Date: " + task.getDueDate());
	                System.out.println("Status: " + completionStatus);
	                System.out.println();
	            }
	        }
	    }

	 
	 public void TaskAdd() {
		    System.out.print("Enter task description: ");
		    String taskDescription = sc.nextLine();
		    System.out.print("Enter due time in days: ");
		    int dueDate = sc.nextInt();
		    TaskConsDes task = new TaskConsDes(taskIdCounter, taskDescription, false, dueDate);
		    taskList.add(task);
		    taskIdCounter++;
		}


	    public void CompletedTasks() {
	        System.out.print("Enter task ID to mark as completed: ");
	        int taskId = sc.nextInt();
	        for (TaskConsDes task : taskList) {
	            if (task.getTaskId() == taskId) {
	                task.markAsCompleted();
	                System.out.println("Task marked as completed.");
	                return;
	            }
	        }
	        System.out.println("Task with that ID does not exist.");
	    }

	    public void TaskDelete() {
	        System.out.println("Enter task ID to delete: ");
	        int taskId = sc.nextInt();
	        for (TaskConsDes task : taskList) {
	            if (task.getTaskId() == taskId) {
	                taskList.remove(task);
	                System.out.println("Task removed successfully.");
	                return;
	            }
	        }
	        System.out.println("Task with that ID does not exist.");
	    }

}
