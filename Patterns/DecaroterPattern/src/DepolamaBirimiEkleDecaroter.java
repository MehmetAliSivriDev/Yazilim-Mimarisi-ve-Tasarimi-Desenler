public class DepolamaBirimiEkleDecaroter extends BilgisayarDecorator{
    public DepolamaBirimiEkleDecaroter(Bilgisayar bilgisayar) {
        super(bilgisayar);
    }

    @Override
    public double fiyat() {
        return super.fiyat()+ 4999;
    }

    @Override
    public String aciklama() {
        return super.aciklama()+ "2 TB SSD Disk eklendi.";
    }

    @Override
    public double fiyat16Gb() {
        return super.fiyat() + 3000;
    }

    @Override
    public String aciklama2() {
        return super.aciklama()+ " 1 TB SSD Disk eklendi";
    }
}
