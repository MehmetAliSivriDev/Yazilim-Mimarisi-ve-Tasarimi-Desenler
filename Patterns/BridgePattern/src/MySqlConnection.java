public class MySqlConnection implements DatabasePlatform{
    @Override
    public void configureConnection() {
        System.out.println("MySql için bağlantı sağlanıyor");
    }
}
