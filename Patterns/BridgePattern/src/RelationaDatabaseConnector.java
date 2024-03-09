public class RelationaDatabaseConnector implements  DatabaseConnecter{
   protected DatabasePlatform platform;

   public RelationaDatabaseConnector(DatabasePlatform platform){
       this.platform=platform;
   }


    @Override
    public void connect() {
        System.out.println("İlişkisel veritabanına bağlandı");
        platform.configureConnection();
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Sorgu çalıştırıldı....:"+query);
    }
}
