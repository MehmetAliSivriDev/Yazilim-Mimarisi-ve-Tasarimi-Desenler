public class PayPalPayment implements  Payment{
    @Override
    public void processPayment() {
        System.out.println("PayPal ile Ödemeniz Gerçekleşti.");

    }
}
