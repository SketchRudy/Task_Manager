/**
 * Represents a specific type of task for reviewing code or documents.
 * Extends the AbstractTask class.
 */
public class ReviewTask extends AbstractTask {
    private String reviewType;

    /**
     * Constructs a ReviewTask with the specified details.
     *
     * @param title The title of the task.
     * @param description A brief description of the review.
     * @param deadline The deadline for the review.
     * @param assignedTeamMember The team member assigned to this task.
     * @param status The current status of the task.
     * @param reviewType The type of review.
     */
    public ReviewTask(String title, String description, String deadline, String assignedTeamMember, String status, String reviewType) {
        super(title, description, deadline, assignedTeamMember, status);
        this.reviewType = reviewType;
    }

    @Override
    public void displayTaskDetails() {
        super.displayTaskDetails();
        System.out.println("Review Type: " + reviewType);
        System.out.println("Task Type: Review");
    }
}
