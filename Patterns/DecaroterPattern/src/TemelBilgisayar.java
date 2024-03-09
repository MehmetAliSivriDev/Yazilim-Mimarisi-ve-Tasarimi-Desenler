//temel bileşen sınıfı

public class TemelBilgisayar implements Bilgisayar{


    @Override
    public double fiyat() {
        return 25000.00; //bilgisayarafiyatı
    }

    @Override
    public String aciklama() {
        return "Temel Bilgisayar";
    }

    @Override
    public double fiyat16Gb() {
        return 4800;
    }

    @Override
    public String aciklama2() {
        return "";
    }
}
