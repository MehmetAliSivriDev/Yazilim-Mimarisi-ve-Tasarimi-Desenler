import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        boolean kontrol = true;

        while(kontrol){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n1- Credit Card Payment\n"
                    + "2- Bank Transfer Payment\n"
                    + "3- Paypal Payment\n"
                    + "q- Exit\n");
            System.out.print("Lutfen bir odeme sekli seciniz: ");
            String odeme = scanner.nextLine();

            switch(odeme){
                case "1":
                    PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
                    Payment creditCardPayment = creditCardFactory.createPayment();
                    creditCardPayment.processPayment();
                    break;

                case "2":
                    PaymentFactory bankTransferFactory = new BankTransferPaymentFactory();
                    Payment bankTransferPayment = bankTransferFactory.createPayment();
                    bankTransferPayment.processPayment();
                    break;

                case "3":
                    PaymentFactory paypalPaymentFactory = new PayPalPaymentFactory();
                    Payment paypalPayment = paypalPaymentFactory.createPayment();
                    paypalPayment.processPayment();
                    break;

                case "q" :
                    System.out.println("Çıkış Yapılıyor.");
                    kontrol = false;
                    break;
                default:
                    System.out.println("Yanlış Giriş Yaptınız Lütfen Tekrar Deneyin.");
                    break;
            }
        }

    }
}