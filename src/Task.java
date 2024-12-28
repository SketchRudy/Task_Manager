/**
 * Represents the basic structure of a task in the system.
 * All task types must implement this interface.
 */
interface Task {

    /**
     * Display the details of the task.
     */
    public void displayTaskDetails(); //  Display the details of the task

    /**
     * Retrieve the current status of the task.
     *
     * @return The status of the task (e.g., "Not Started", "In Progress", "Completed").
     */
    public String getStatus(); // Return the status of the task (e.g., "Not Started", "In Progress", "Completed").
}
