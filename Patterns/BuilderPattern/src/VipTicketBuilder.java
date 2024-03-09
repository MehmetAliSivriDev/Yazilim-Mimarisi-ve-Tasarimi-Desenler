public class VipTicketBuilder implements TicketBuilder{

    private Ticket ticket;

    @Override
    public void buildPassengerName() {
        ticket.setPassengerName("Veysel Uğurlu");
    }

    @Override
    public void buildDepartureLocation() {
        ticket.setDepartureLocation("İstanbul Sabiha Gökçen Havalimanı");
    }

    @Override
    public void buildDestination() {
        ticket.setDestination("Siirt Havalimanı");
    }

    @Override
    public void buildDate() {
        ticket.setDate("12-12-2023");
    }

    @Override
    public void buildSeatNumber() {
        ticket.setSeatNumber("10V");
    }

    @Override
    public Ticket getTicket() {
        return ticket;
    }

    public VipTicketBuilder(){
        this.ticket = new Ticket();
    }
}
