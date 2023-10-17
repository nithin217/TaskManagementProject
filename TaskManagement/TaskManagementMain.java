package TaskManagement;
import java.util.Scanner;

public class TaskManagementMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Task Management System Project");
        String ch;
        ProjectCreation pc = new ProjectCreation();
        do{
            System.out.println("1) View All Tasks");
            System.out.println("2) Add a Task");
            System.out.println("3) Mark Task as Completed");
            System.out.println("4) Delete a Task");
            System.out.println("5) Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    pc.ViewTasks();
                    break;
                case 2:
                    pc.TaskAdd();
                    break;
                case 3:
                    pc.CompletedTasks();
                    break;
                case 4:
                    pc.TaskDelete();
                    break;
                case 5:
                    System.out.println("Thank you for using our application !!!");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Wrong choice!!");
            }

            System.out.println("Do you want to continue? \n Y for YES \n N for NO");
            ch=sc.next();
        }while(ch.equals("Y") || ch.equals("y"));
        System.out.println("Please restart if you want to use again !!");
    }
}