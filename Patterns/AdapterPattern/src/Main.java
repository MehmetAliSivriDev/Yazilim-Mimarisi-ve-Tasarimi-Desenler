public class Main {
    public static void main(String[] args) {

        //Mevcut sistemdeki görev
        Gorev basitGorev = new BasitGorev("Temel Görevler");

        //Farklı bir görev tipi
        GelistirilmisGorev gelistirilmisGorev = new GelistirilmisGorev("Gelişmiş Görevler");

        //Adaptasyon işlemleri

        Gorev adapter = new GelistirilmisGorevAdapter(gelistirilmisGorev);

        System.out.println("Basit Görev:"+basitGorev.getGorevAdi());
        System.out.println("Gelişmiş Görev:"+adapter.getGorevAdi());


    }
}