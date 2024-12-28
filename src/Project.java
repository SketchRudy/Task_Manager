import java.util.ArrayList;
import java.util.List;

/**
 * Represents a project that contains multiple tasks.
 * Allows management of tasks, including assignment and status updates.
 */
public class Project {
    private String projectName;
    private List<Task> tasks;

    /**
     * Constructs a project with the specified name
     *
     * @param projectName the name of the project
     */
    public Project(String projectName) {
        this.projectName = projectName;
        this.tasks = new ArrayList<>();
    }

    // Method to add a task to the project
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Method to assign a team member to a task
    public void assignTask(String taskTitle, String teamMember) {
        for (Task task : tasks) {
            if (task instanceof AbstractTask) {
                if (((AbstractTask) task).title.equals(taskTitle)) {
                    ((AbstractTask) task).assignedTeamMember = teamMember;
                }
            }
        }
    }

    /**
     *
     * @param taskTitle The name of the task
     * @param status The status of the task
     */
    // Method to update the status of a task
    public void updateTaskStatus(String taskTitle, String status) {
        for (Task task : tasks) {
            if (task instanceof AbstractTask) {
                if (((AbstractTask) task).title.equals(taskTitle)) {
                    ((AbstractTask) task).status = status;
                }
            }
        }
    }

    // Method to display the project details
    public void displayProjectDetails() {
        System.out.println("Project Name: " + projectName);
        for (Task task : tasks) {
            task.displayTaskDetails();
            System.out.println();
        }
    }

    /**
     *
     * @param status the status of the task
     */
    public void displayTasksByStatus(String status) {
        for (Task task : tasks) {
            if (task.getStatus().equals(status)) {
                task.displayTaskDetails();
                System.out.println();
            }
        }
    }

    /**
     *
     * @param teamMember The member the task is assigned to
     */
    public void displayTasksByTeamMember(String teamMember) {
        for (Task task : tasks) {
            if (task instanceof AbstractTask) {
                if (((AbstractTask) task).assignedTeamMember.equals(teamMember)) {
                    task.displayTaskDetails();
                    System.out.println();
                }
            }
        }
    }
}
