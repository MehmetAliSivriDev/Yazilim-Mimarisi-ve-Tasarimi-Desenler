public class BusinessTicketBuilder implements TicketBuilder{

    private Ticket ticket;

    @Override
    public void buildPassengerName() {
        ticket.setPassengerName("Mehmet Ali Sivri");
    }

    @Override
    public void buildDepartureLocation() {
        ticket.setDepartureLocation("İstanbul Sabiha Gökçen Havalimanı");
    }

    @Override
    public void buildDestination() {
        ticket.setDestination("Bursa Havalimanı");
    }

    @Override
    public void buildDate() {
        ticket.setDate("12-12-2023");
    }

    @Override
    public void buildSeatNumber() {
        ticket.setSeatNumber("5D");
    }

    @Override
    public Ticket getTicket() {
        return ticket;
    }

    public BusinessTicketBuilder(){
        this.ticket = new Ticket();
    }
}
