import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IHGSSystem hgsSystem = new HGSSystem();

        HGSAccount account = new HGSAccount("Mehmet Ali",11111111111L,"Sivri");

        System.out.println("HGS Geçiş Uygulaması");
        System.out.println("Yapabileceğiniz İşlemler :");

        String hesapIslemleri = "1- Yeni Hesap Oluşturun \n2- Geçiş Yapın \n3- Gecislerinizi Goruntuleyin\n4-Kullanici Bilgilerini Goruntuleyin" +
                "\nq- Uygulamadan Çıkın" +
                "\nUygulamak Istediginiz Islemi Giriniz =";

        while(true){
            System.out.print(hesapIslemleri);
            String girisIslemi = scanner.nextLine();


            if(girisIslemi.equals("1")){
                account = hgsSystem.createAccount();
                System.out.println("Hesabınız Başarı Ile Oluşturulmuştur.");
            }
            else if (girisIslemi.equals("2")){
                hgsSystem.doTransition(account);

            }
            else if (girisIslemi.equals("3")){
                account.displayPassages();
            }
            else if (girisIslemi.equals("4")){
                account.displayAccount();
            }
            else if (girisIslemi.equals("q")){
                System.out.println("Sistemden Çıkış Yapılıyor.");
                break;
            }
        }

    }
}