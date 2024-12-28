/**
 * A base class that provides common functionality for all task types.
 * Implements the Task interface.
 */
public class AbstractTask implements Task {
    // Supposed to be protected instead of private?
    protected String title;
    protected String description;
    protected String deadline;
    protected String assignedTeamMember;
    protected String status;

    /**
     * Constructs an AbstractTask with the specified details.
     *
     * @param title The title of the task.
     * @param description A brief description of the task.
     * @param deadline The deadline for completing the task.
     * @param assignedTeamMember The team member assigned to this task.
     * @param status The current status of the task.
     */
    public AbstractTask(String title, String description, String deadline, String assignedTeamMember, String status) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.assignedTeamMember = assignedTeamMember;
        this.status = status;
    }

    // Method to display the task details
    @Override
    public void displayTaskDetails() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Deadline: " + deadline);
        System.out.println("Assigned Team Member: " + assignedTeamMember);
        System.out.println("Status: " + status);
    }

    @Override
    public String getStatus() {
        return status;
    }
}
