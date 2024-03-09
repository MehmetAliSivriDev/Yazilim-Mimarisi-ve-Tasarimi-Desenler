public class Main {
    public static void main(String[] args) {


        DatabaseConnecter relaDatabaseConnecter = new RelationaDatabaseConnector(new MySqlConnection());
        relaDatabaseConnecter.connect();
        relaDatabaseConnecter.executeQuery("select * from tblUsers");


        DatabaseConnecter noSqlConnector = new NoSqlDatabaseConnector(new MongoDbConnection());
        noSqlConnector.connect();
        noSqlConnector.executeQuery("db.users.find()");




    }
}