package TaskManagement;

public class TaskConsDes {
	private int taskId;
    private String taskDescription;
    private boolean completed;
    private int dueDate;

    public TaskConsDes(int taskId, String taskDescription, boolean completed, int dueDate) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.completed = completed;
        this.dueDate = dueDate;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean isCompleted() {
        return completed;
    }
    

    public int getDueDate() {
        return dueDate;
    }
    public void markAsCompleted() {
        completed = true;
    }
    

    @Override
    public String toString() {
        return "Task [ID: " + taskId + ", Description: " + taskDescription + ", Due Date: " + dueDate + " ,Completed: " + (completed ? "Yes" : "No") + "]";
    }


}
