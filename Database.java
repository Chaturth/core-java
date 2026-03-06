class Database
{
    String databaseName;

    Database(String databaseName)
    {
        this.databaseName = databaseName;
    }

    void getInfo()
    {
        System.out.println("Database: " + databaseName);
    }
}