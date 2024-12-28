/**
 * Represents a specific type of task for fixing bugs.
 * Extends the AbstractTask class.
 */
public class BugFixTask extends AbstractTask {
    private String severity;

    /**
     * Constructs a BugFixTask with the specified details.
     *
     * @param title The title of the task.
     * @param description A brief description of the bug.
     * @param deadline The deadline for fixing the bug.
     * @param assignedTeamMember The team member assigned to this task.
     * @param status The current status of the task.
     * @param severity The severity level of the bug.
     */
    public BugFixTask(String title, String description, String deadline, String assignedTeamMember, String status, String severity) {
        super(title, description, deadline, assignedTeamMember, status);
        this.severity = severity;
    }

    @Override
    public void displayTaskDetails() {
        super.displayTaskDetails();
        System.out.println("Severity: " + severity);
        System.out.println("Task Type: Bug Fix");
    }
}
