/**
 * The main entry point of the application.
 * Provides a command-line interface (CLI) for managing tasks in a project.
 *
 * @Author Rudy S
 */
import java.util.Scanner;

// This class is the main entry point of the application
public class TaskMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Project project = new Project("Demo Project");

        while (true) {
            // Print the menu
            System.out.println("1. Add Task");
            System.out.println("2. Assign Task");
            System.out.println("3. Update Task Status");
            System.out.println("4. View Project Details");
            System.out.println("5. View Tasks by Status");
            System.out.println("6. View Tasks by Team Member");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            // Get the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine();  // go next

            switch (choice) {
                case 1:
                    System.out.print("Enter task type (BugFix/Feature/Review): ");
                    String taskType = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter deadline: ");
                    String deadline = scanner.nextLine();
                    System.out.print("Enter assigned team member: ");
                    String assignedTeamMember = scanner.nextLine();
                    System.out.print("Enter status: ");
                    String status = scanner.nextLine();
                    Task task;
                    switch (taskType) {
                        case "BugFix":
                            System.out.print("Enter severity: ");
                            String severity = scanner.nextLine();
                            task = new BugFixTask(title, description, deadline, assignedTeamMember, status, severity);
                            break;
                        case "Feature":
                            System.out.print("Enter feature type: ");
                            String featureType = scanner.nextLine();
                            task = new ReviewTask(title, description, deadline, assignedTeamMember, status, featureType);
                            break;
                        case "Review":
                            System.out.print("Enter review type: ");
                            String reviewType = scanner.nextLine();
                            task = new ReviewTask(title, description, deadline, assignedTeamMember, status, reviewType);
                            break;
                        default:
                            System.out.println("Invalid task type!");
                            continue;
                    }
                    project.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task title to assign: ");
                    String taskId = scanner.nextLine();
                    System.out.print("Enter team member name: ");
                    String teamMember = scanner.nextLine();
                    project.assignTask(taskId, teamMember);
                    break;
                case 3:
                    System.out.print("Enter task title to update: ");
                    taskId = scanner.nextLine();
                    System.out.print("Enter new status: ");
                    status = scanner.nextLine();
                    project.updateTaskStatus(taskId, status);
                    break;
                case 4:
                    project.displayProjectDetails();
                    break;
                case 5:
                    System.out.print("Enter status to filter: ");
                    status = scanner.nextLine();
                    project.displayTasksByStatus(status);
                    break;
                case 6:
                    System.out.print("Enter team member name to filter: ");
                    teamMember = scanner.nextLine();
                    project.displayTasksByTeamMember(teamMember);
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
