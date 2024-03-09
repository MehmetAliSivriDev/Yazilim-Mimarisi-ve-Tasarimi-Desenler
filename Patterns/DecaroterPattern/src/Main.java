public class Main {
    public static void main(String[] args) {

        Bilgisayar temelBilgisayar = new TemelBilgisayar();
        System.out.println("Fiyat: "+temelBilgisayar.fiyat()+ "TL" );
        System.out.println("Açıklma: " + temelBilgisayar.aciklama());

        //Ram eklenmiş

        Bilgisayar ramBilgisayar = new RamEkleDecaoter(new TemelBilgisayar());
        System.out.println("Fiyat: "+ramBilgisayar.fiyat()+ " TL");
        System.out.println("Açıklama: " + ramBilgisayar.aciklama());

        //depolama birimi ve ram eklenen

        Bilgisayar depolomaRamliBilgisayar = new DepolamaBirimiEkleDecaroter(new RamEkleDecaoter(new TemelBilgisayar()));
        System.out.println("Fiyat: "+depolomaRamliBilgisayar.fiyat());
        System.out.println("Açıklama: "+depolomaRamliBilgisayar.aciklama());

        //sadece depolama

        Bilgisayar depolamaBilgisayar = new DepolamaBirimiEkleDecaroter(new TemelBilgisayar());
        System.out.println("Fiyat: "+depolamaBilgisayar.fiyat());
        System.out.println("Açıklama: " +depolamaBilgisayar.aciklama());

        //16 Gb ram eklenmiş

        Bilgisayar ramBilgisayar2 = new RamEkleDecaoter(new TemelBilgisayar());
        System.out.println("Fiyat (16GB): "+ramBilgisayar2.fiyat16Gb()+ " TL");
        System.out.println("Açıklama: " + ramBilgisayar2.aciklama2());

        //1 Tb depolama eklenmiş

        Bilgisayar depolamaBilgisayar2 = new DepolamaBirimiEkleDecaroter(new TemelBilgisayar());
        System.out.println("Fiyat: " +depolamaBilgisayar2.fiyat16Gb() + "TL");
        System.out.println("Açıklama: " + depolamaBilgisayar2.aciklama2());

    }
}