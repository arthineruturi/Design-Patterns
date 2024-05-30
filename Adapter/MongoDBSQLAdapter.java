package Adapter;


public class MongoDBSQLAdapter implements Database {
 private AppDatabase appDatabase;

 public MongoDBSQLAdapter(AppDatabase appDatabase) {
     this.appDatabase = appDatabase;
 }
 public void connect(String databaseName) {
    
     appDatabase.connect(databaseName);
 }

 @Override
 public void executeQuery(String query) {
	 String mongoQuery = translateSQLToMongoQuery(query);
     appDatabase.executeQuery(mongoQuery);
//     appDatabase.executeQuery(query);
 }
 private String translateSQLToMongoQuery(String sqlQuery) {
  
     if (sqlQuery.startsWith("SELECT")) {
         return "db.collection.find()"; 
     }
  
     return sqlQuery; 
 }
}
