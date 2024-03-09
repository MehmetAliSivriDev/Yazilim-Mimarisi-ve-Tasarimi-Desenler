// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TicketAgent agent = new TicketAgent();

        TicketBuilder economyTicketBuilder = new EconomyTicketBuilder();
        TicketBuilder businessTicketBuilder = new BusinessTicketBuilder();
        TicketBuilder vipTicketBuilder = new VipTicketBuilder();

        //Ekonomi sınıfına ait biletler oluşturuluyor
        agent.setTicketBuilder(economyTicketBuilder);
        agent.buildTicket();
        Ticket economyTicket = agent.getTicket();
        System.out.println("Economy Ticket: \n" + economyTicket);


        System.out.println("*****************************************");

        //Business Sınıfına ait biletler oluşturuluyor
        agent.setTicketBuilder(businessTicketBuilder);
        agent.buildTicket();
        Ticket businessTicket = agent.getTicket();
        System.out.println("Business Ticket: \n" + businessTicket);

        System.out.println("*****************************************");

        //Vip Sınıfına ait biletler oluşturuluyor
        agent.setTicketBuilder(vipTicketBuilder);
        agent.buildTicket();
        Ticket vipTicket = agent.getTicket();
        System.out.println("Vip Ticket: \n" + vipTicket);
    }
}