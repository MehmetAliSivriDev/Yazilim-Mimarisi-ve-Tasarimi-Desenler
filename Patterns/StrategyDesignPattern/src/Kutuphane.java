import java.util.List;

public class Kutuphane {

    private KitapSiralaStrategy siralaStrategy;

    public void setSortingStrategy(KitapSiralaStrategy siralaStrategy){
        this.siralaStrategy = siralaStrategy;
    }

    public void kitaplarListele(List<Kitap> kitaplar){
        siralaStrategy.sort(kitaplar);

        for(Kitap kitap : kitaplar){
            System.out.println(kitap);
        }
    }

    private KitapState guncelDurumu;

    public void setState(KitapState state){
        this.guncelDurumu = state;

    }

    public void kitaplarGuncelDurumuListele(List<Kitap> kitaplar){
        guncelDurumu.kitapDurumState(kitaplar);
    }

}
