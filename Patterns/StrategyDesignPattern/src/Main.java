import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Kitap> kitaplar = new ArrayList<>();
        kitaplar.add(new Kitap("Design Pattern","Erich Ganna",400,true,false));
        kitaplar.add(new Kitap("Clean Code","Robert C. Martin",300,false,true));
        kitaplar.add(new Kitap("Java: The Complete Reference","Herbert Schildt",200,true,true));

        Kutuphane kutuphane = new Kutuphane();

        KitapSiralaStrategy adinaGore = new AdinaGoreSiralamaStrategy();

        KitapSiralaStrategy yazaraGore = new YazarinaGoreSiralamaStrategy();

        KitapSiralaStrategy sayfaSayisinaGore = new SayfaSayisiniGoreSiralamaStrategy();

        kutuphane.setSortingStrategy(sayfaSayisinaGore);
        kutuphane.kitaplarListele(kitaplar);

        KitapState onerilenState = new OnerilenKitaplarState();

        KitapState populerState = new PopulerKitaplarState();

        kutuphane.setState(populerState);
        kutuphane.kitaplarGuncelDurumuListele(kitaplar);

    }
}