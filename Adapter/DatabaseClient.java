package Adapter;

public class DatabaseClient {
 public static void main(String[] args) {
     
     Database sqlDatabase = new AppDatabase();
     sqlDatabase.connect("SQLDatabase");
     sqlDatabase.executeQuery("SELECT * FROM Adapter");

     Database mongoDBSQLAdapter = new MongoDBSQLAdapter((AppDatabase) sqlDatabase);
     sqlDatabase.connect("MongoDbDatabase");
     mongoDBSQLAdapter.executeQuery("db.collection.find()");
 }
}

