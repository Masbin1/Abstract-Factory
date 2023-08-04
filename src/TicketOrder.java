public class TicketOrder {
    private TicketFactory ticketFactory;

    public TicketOrder(TicketFactory ticketFactory) {
        this.ticketFactory = ticketFactory;
    }

    public Ticket orderTicket() {
        return ticketFactory.createTicket();
    }
}
