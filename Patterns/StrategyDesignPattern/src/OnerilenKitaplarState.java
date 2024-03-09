import java.util.List;

public class OnerilenKitaplarState implements KitapState{
    @Override
    public void kitapDurumState(List<Kitap> kitaplar) {
        System.out.println("Önerilen Kitaplar");

        for(Kitap kitap : kitaplar){
            if(kitap.isOnerilen())
            {
                System.out.println(kitap);
            }
        }
    }

}
