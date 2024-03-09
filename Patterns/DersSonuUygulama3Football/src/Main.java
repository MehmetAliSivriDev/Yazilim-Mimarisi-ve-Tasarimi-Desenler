import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FootballCoach teknikDirektor = new FootballCoach("Fatih Terim",70,"Türkiye","Galatasaray");
        Footballer futbolcu = new Footballer("Wesley Sneijder",39,"Hollanda","Galatasaray","Orta Saha");

        String islemler = "1- Futbolcu Bilgilerini Görüntüle\n" +
                          "2- Teknil Direktör Bilgilerini Görüntüle\n" +
                          "3- Futbolcunun Pozisyonunu Güncelle\n" +
                          "q- Uygulamadan Cıkış Yap\n" +
                          "Uygulamak Istediğiniz İşlemi Giriniz= ";

        while(true){
            System.out.print(islemler);
            String islem = scanner.nextLine();

            if(islem.equals("1")){
                futbolcu.playerInformation();
            }
            else if(islem.equals("2")){
                teknikDirektor.playerInformation();
            }
            else if (islem.equals("3")){
                System.out.print("Futbolcunun Yeni Pozisyonunu Giriniz= ");
                String newPosition = scanner.nextLine();
                futbolcu.setPosition(newPosition);
            }
            else if(islem.equals("q")){
                System.out.println("Uygulamadan Çıkış Yapılıyor...");
                break;
            }else{
                System.out.println("Yanlış Girdiniz Lütfen Tekrar Deneyin.");
                System.out.println("--------------------------------------");
            }
        }

    }
}