import java.util.List;

public class PopulerKitaplarState implements KitapState{
    @Override
    public void kitapDurumState(List<Kitap> kitaplar) {
        System.out.println("Popüler Kitaplar");

        for(Kitap kitap : kitaplar){
            if(kitap.isPopulerMi())
            {
                System.out.println(kitap);
            }
        }
    }
}
