package Adapter;


public class AppDatabase implements Database {  //

	public void connect(String databaseName) {
        System.out.println("Connecting to  database: " + databaseName);
        
    }

 @Override
 public void executeQuery(String query) {
     System.out.println("Executing  query: " + query);
     
 }
}

