public class RamEkleDecaoter extends BilgisayarDecorator{


    public RamEkleDecaoter(Bilgisayar bilgisayar) {
        super(bilgisayar);
    }

    @Override
    public double fiyat() {
        return super.fiyat() + 2500;
    }

    @Override
    public String aciklama() {
        return super.aciklama()+" 8 Gb Ram eklendi";
    }
    public  double fiyat16Gb(){
        return super.fiyat() + 4800;
    }
    public String aciklama2(){
        return super.aciklama ()+ " 16 Gb ram eklendi";
    }

}
