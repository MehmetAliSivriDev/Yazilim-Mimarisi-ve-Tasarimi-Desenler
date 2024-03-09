import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PaymentFactory paymentFactory = new PaymentFactory();
        Payment creditCartPayment = paymentFactory.createPayment("CreditCard");
        creditCartPayment.processPayment();

        boolean kontrol = true;

        while(kontrol){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n1- Credit Card Payment\n"
                    + "2- Bank Transfer Payment\n"
                    + "3- Paypal Payment\n"
                    + "4- Dijital Payment\n"
                    + "q- Exit\n");
            System.out.print("Lutfen bir odeme sekli seciniz: ");
            String odeme = scanner.nextLine();

            switch(odeme){
                case "1":
                    Payment creditCartPayment = paymentFactory.createPayment("CreditCard");
                    creditCartPayment.processPayment();
                    break;

                case "2":
                    Payment bankTransferPayment = paymentFactory.createPayment("BankTransfer");
                    bankTransferPayment.processPayment();
                    break;

                case "3":
                    Payment payPalPayment = paymentFactory.createPayment("PayPal");
                    payPalPayment.processPayment();
                    break;

                case "4":
                    Payment dijitalPayment = paymentFactory.createPayment("Dijital");
                    dijitalPayment.processPayment();
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