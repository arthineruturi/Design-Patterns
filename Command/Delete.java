package Command;

public class Delete implements Command {
    private Database db;
    private String data;
    
    public Delete(Database db, String data) {
        this.db = db;
        this.data = data;
    }
    
    @Override
    public void execute() {
        db.delete(data);
    }
    
    @Override
    public void rollback() {
        db.insert(data);
    }
}
