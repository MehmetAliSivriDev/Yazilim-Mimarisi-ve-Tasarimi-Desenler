public class CreditCartPayment implements  Payment{
    @Override
    public void processPayment() {
        System.out.println("Kredi Kartı ile Ödemeniz Gerçekleşti.");
    }
}
