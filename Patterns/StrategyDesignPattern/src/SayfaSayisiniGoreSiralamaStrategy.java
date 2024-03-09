import java.util.List;

public class SayfaSayisiniGoreSiralamaStrategy implements KitapSiralaStrategy{

    @Override
    public void sort(List<Kitap> kitaplar) {
        kitaplar.sort((b1,b2) -> Integer.compare(b1.getSayfaSayisi(), b2.getSayfaSayisi()));
        System.out.println("Kitaplar, sayfa sırasına sırasına göre sıralandı.");
    }
}
