public class BankTransferPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("Bank Transfer ile Ödemeniz Gerçekleştirildi.");
    }
}
