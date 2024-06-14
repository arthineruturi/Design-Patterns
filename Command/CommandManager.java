package Command;
import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> commands = new ArrayList<>();
    private boolean executed = false;
    
    public void addCommand(Command command) {
        commands.add(command);
    }
    
    public void execute() {
        try {
            for (Command command : commands) {
                command.execute();
            }
            executed = true;
        } catch (Exception e) {
            System.out.println("Error during execution: " + e.getMessage());
            rollback();
        }
    }
    
    public void rollback() {
        if (!executed) {
            System.out.println("Nothing to rollback, transaction was not executed.");
            return;
        }
        
        for (Command command : commands) {
            try {
                command.rollback();
            } catch (Exception e) {
                System.out.println("Error during rollback: " + e.getMessage());
            }
        }
    }
    
//    public void undoLastCommand() {
//        if (!commands.isEmpty()) {
//            Command lastCommand = commands.remove(commands.size() - 1);
//            lastCommand.rollback();
//        } else {
//            System.out.println("No commands to undo.");
//        }
//    }
    
    public boolean isExecuted() {
        return executed;
    }
}
