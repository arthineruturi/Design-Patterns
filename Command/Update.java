package Command;

public class Update implements Command {
    private Database db;
    private String oldData;
    private String newData;
    
    public Update(Database db, String oldData, String newData) {
        this.db = db;
        this.oldData = oldData;
        this.newData = newData;
    }
    
    @Override
    public void execute() {
        db.update(oldData, newData);
    }
    
    @Override
    public void rollback() {
        db.update(newData, oldData);
    }
}
