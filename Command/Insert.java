package Command;

public class Insert implements Command {
    private Database db;
    private String data;
    
    public Insert(Database db, String data) {
        this.db = db;
        this.data = data;
    }
    
    @Override
    public void execute() {
        db.insert(data);
    }
    
    @Override
    public void rollback() {
        db.delete(data);
    }
}
