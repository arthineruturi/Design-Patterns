package Adapter;

public interface Database {
 void connect(String databaseName);
 void executeQuery(String query);
}

