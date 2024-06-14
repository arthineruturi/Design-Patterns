package Command;

public class Database {
    public void insert(String data) {
        System.out.println("Inserting data: " + data);
    }
    
    public void update(String oldData, String newData) {
        System.out.println("Updating data from: " + oldData + " to: " + newData);
    }
    
    public void delete(String data) {
        System.out.println("Deleting data: " + data);
    }
}

