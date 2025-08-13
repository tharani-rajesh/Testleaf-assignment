package week4day1;

public abstract class MySqlConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL Database");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Executing UPDATE in MySQL Database");
    }

    // New abstract method
    public abstract void executeQuery();
}



