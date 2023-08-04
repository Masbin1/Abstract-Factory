public class RegularTicketFactory extends TicketFactory {
    @Override
    public Ticket createTicket() {
        return new RegularTicket();
    }
}
