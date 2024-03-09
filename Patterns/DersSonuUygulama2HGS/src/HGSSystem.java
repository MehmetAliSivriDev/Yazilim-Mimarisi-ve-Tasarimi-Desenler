import java.util.Scanner;

public class HGSSystem implements  IHGSSystem{

    private Scanner scanner = new Scanner(System.in);

    @Override
    public HGSAccount createAccount() {

        System.out.println("---Hızlı Geçiş Sistemi---");
        System.out.println("---Hesap Oluşturma İşlemi---");

        System.out.print("Adınızı Giriniz =");
        String firstName = scanner.nextLine();

        System.out.println("Soyadınızı Giriniz =");
        String lastName = scanner.nextLine();

        System.out.println("TC Kimlik Numaranızı (11 Hane Olmalı!)=");
        Long identity = scanner.nextLong();

        HGSAccount newAccount = new HGSAccount(firstName,identity,lastName);

        System.out.println("Hesabınız Başarıyla Oluşturuldu.");

        return newAccount;

    }

    @Override
    public void doTransition(HGSAccount account) {
        System.out.print("Geçiş Tarihinizi Giriniz =");
        String date = scanner.nextLine();

        System.out.print("Geçiş Güzergahınızı Giriniz =");
        String route = scanner.nextLine();

        HGSPassage newPassage = new HGSPassage(date,route);

        account.setBalance(account.getBalance() - newPassage.getFee());

        account.addPassages(newPassage);
    }
}
