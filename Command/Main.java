package Command;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Insert insertCommand = new Insert(db, "data1");
        Update updateCommand = new Update(db, "data1", "data2");
        Delete deleteCommand = new Delete(db, "data2");

        CommandManager manager = new CommandManager();
        manager.addCommand(insertCommand);
        manager.addCommand(updateCommand);
        manager.addCommand(deleteCommand);
        
   
        System.out.println("Executing transaction...");
        manager.execute();

        if (true==manager.isExecuted()) {
            System.out.println("Transaction executed successfully.");
        }

    
        System.out.println("Rolling back transaction...");
        manager.rollback();

 
//        System.out.println("Undoing last command...");
//        manager.undoLastCommand();
    }
}
