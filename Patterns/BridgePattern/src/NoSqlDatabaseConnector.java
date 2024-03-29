public class NoSqlDatabaseConnector implements DatabaseConnecter{
    protected DatabasePlatform platform;
    public NoSqlDatabaseConnector(DatabasePlatform platform){
        this.platform=platform;
    }
    @Override
    public void connect() {
        System.out.println("NoSql veri tabanına bağlanıyor");
        platform.configureConnection();
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Sorgu çalıştırıldı....:"+query);
    }
}
