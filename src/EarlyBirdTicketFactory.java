public class EarlyBirdTicketFactory extends TicketFactory {
    @Override
    public Ticket createTicket() {
        return new EarlyBirdTicket();
    }
}
