import java.util.ArrayList;
import java.util.List;

// Non-public Commandable interface
interface Commandable<T> {
    void setCommand(String commandType, T commandValue);
    T getCommandValue();
    void executeCommand();
}

public class WilbertRobot<T> implements Commandable<T> {
    private int robotId;
    private String robotType;
    private String commandType;
    private T commandValue;
    private String robotStatus;

    // Default constructor
    public WilbertRobot() {
        this.robotStatus = "Idle";
    }

    // Constructor with robotId and robotType
    public WilbertRobot(int robotId, String robotType) {
        this.robotId = robotId;
        this.robotType = robotType;
        this.robotStatus = "Idle";
    }

    // Getters and setters
    public int getRobotId() {
        return robotId;
    }

    public void setRobotId(int robotId) {
        this.robotId = robotId;
    }

    public String getRobotType() {
        return robotType;
    }

    public void setRobotType(String robotType) {
        this.robotType = robotType;
    }

    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    @Override
    public void setCommand(String commandType, T commandValue) {
        this.commandType = commandType;
        this.commandValue = commandValue;
    }

    @Override
    public T getCommandValue() {
        return commandValue;
    }

    // New method to update robot's status
    public void updateStatus(String status) {
        this.robotStatus = status;
    }

    @Override
    public void executeCommand() {
        System.out.println("Robot " + robotId + " (" + robotType + ") executing command: " + commandValue);
    }

    // Override toString to include robotStatus
    @Override
    public String toString() {
        return "WilbertRobot{" +
                "robotId=" + robotId +
                ", robotType='" + robotType + '\'' +
                ", commandType='" + commandType + '\'' +
                ", commandValue=" + commandValue +
                ", status='" + robotStatus + '\'' +
                '}';
    }

    // Static method to execute commands for a list of robots with wildcard type
    public static void executeCommands(List<WilbertRobot<?>> robots) {
        for (WilbertRobot<?> robot : robots) {
            robot.executeCommand();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        WilbertRobot<String> robot1 = new WilbertRobot<>(1, "DeliveryBot");
        robot1.setCommand("Deliver", "Package to Sector 9");

        WilbertRobot<Character> robot2 = new WilbertRobot<>(2, "SecurityBot");
        robot2.setCommand("Patrol", 'C');

        List<WilbertRobot<?>> robots = new ArrayList<>();
        robots.add(robot1);
        robots.add(robot2);

        executeCommands(robots);

        // Testing the updateStatus method
        robot1.updateStatus("Active");
        robot2.updateStatus("In Maintenance");

        // Displaying updated robot information
        System.out.println(robot1);
        System.out.println(robot2);
    }
}
